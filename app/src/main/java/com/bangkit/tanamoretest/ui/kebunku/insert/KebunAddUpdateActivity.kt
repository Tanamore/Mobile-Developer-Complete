package com.bangkit.tanamoretest.ui.kebunku.insert

import android.Manifest
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.ViewModelProvider
import com.bangkit.tanamoretest.R
import com.bangkit.tanamoretest.databinding.ActivityKebunAddUpdateBinding
import com.bangkit.tanamoretest.ui.kebunku.KebunkuFragment
import com.bangkit.tanamoretest.ui.kebunku.database.Kebun
import com.bangkit.tanamoretest.ui.kebunku.helper.ViewModelFactory
import java.io.File

class KebunAddUpdateActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NOTE = "extra_note"
        const val ALERT_DIALOG_CLOSE = 10
        const val REQUEST_CODE = 1001
        const val MAX_IMAGE_SIZE_MB = 8
    }

    private var isEdit = false
    private var kebun: Kebun? = null
    private lateinit var kebunAddUpdateViewModel: KebunAddUpdateViewModel

    private var _activityKebunAddUpdateBinding: ActivityKebunAddUpdateBinding? = null
    private val binding get() = _activityKebunAddUpdateBinding

    private var imageUri: Uri? = null

    private val getResultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                imageUri = result.data?.data
                if (isValidImageSize(imageUri)) {
                    loadImageFromUri(imageUri)
                } else {
                    Toast.makeText(this, "Image size exceeds 8 MB", Toast.LENGTH_SHORT).show()
                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_MEDIA_IMAGES),
                REQUEST_CODE
            )
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                REQUEST_CODE
            )
        }

        _activityKebunAddUpdateBinding = ActivityKebunAddUpdateBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.icBack?.setOnClickListener {
            val intent = Intent(this, KebunkuFragment::class.java)
            startActivity(intent)
            finish()
        }

        kebunAddUpdateViewModel = obtainViewModel(this@KebunAddUpdateActivity)

        kebun = intent.getParcelableExtra(EXTRA_NOTE)
        if (kebun != null) {
            isEdit = true
        } else {
            kebun = Kebun()
        }

        val actionBarTitle: String
        val btnTitle: String

        if (isEdit) {
            actionBarTitle = getString(R.string.change)
            btnTitle = getString(R.string.update)

            kebun?.let { note ->
                binding?.edtDescription?.setText(note.description)

                if (!note.imagePath.isNullOrEmpty()) {
                    val uri = Uri.parse(note.imagePath)
                    loadImageFromUri(uri)
                }
            }
        } else {
            actionBarTitle = getString(R.string.add)
            btnTitle = getString(R.string.save)
        }

        val fruitNames = resources.getStringArray(R.array.fruit_names)
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, fruitNames)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding?.spinnerTitle?.adapter = spinnerAdapter

        binding?.imgPhoto?.setOnClickListener {
            openGallery()
        }

        supportActionBar?.title = actionBarTitle
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding?.btnSubmit?.text = btnTitle
        binding?.btnSubmit?.setOnClickListener {
            val title = binding?.spinnerTitle?.selectedItem.toString()
            val description = binding?.edtDescription?.text.toString().trim()

            when {
                title == fruitNames[0] -> {
                    Toast.makeText(this, "Silakan pilih Tanaman", Toast.LENGTH_SHORT).show()
                }
                description.isEmpty() -> {
                    binding?.edtDescription?.error = getString(R.string.empty)
                }
                else -> {
                    kebun?.let { note ->
                        note.title = title
                        note.description = description
                        if (imageUri != null) {
                            note.imagePath = imageUri.toString()
                        }
                    }
                    if (isEdit) {
                        kebunAddUpdateViewModel.update(kebun as Kebun)
                        showToast(getString(R.string.changed))
                    } else {
                        kebunAddUpdateViewModel.insert(kebun as Kebun)
                        showToast(getString(R.string.added))
                    }
                    finish()
                }
            }
        }

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                showAlertDialog(ALERT_DIALOG_CLOSE)
            }
        })
    }

    private fun isValidImageSize(uri: Uri?): Boolean {
        uri?.let {
            val fileDescriptor = contentResolver.openFileDescriptor(it, "r")
            fileDescriptor?.let {
                val fileSizeInBytes = it.statSize
                val fileSizeInMB = fileSizeInBytes / (1024 * 1024)
                it.close()
                return fileSizeInMB <= MAX_IMAGE_SIZE_MB
            }
        }
        return false
    }

    private fun loadImageFromUri(uri: Uri?) {
        try {
            uri?.let {
                val inputStream = contentResolver.openInputStream(it)
                val options = BitmapFactory.Options().apply {
                    inJustDecodeBounds = true
                }
                BitmapFactory.decodeStream(inputStream, null, options)

                options.inSampleSize = calculateInSampleSize(options, 1024, 1024)
                options.inJustDecodeBounds = false

                inputStream?.close()
                val newInputStream = contentResolver.openInputStream(it)
                val bitmap = BitmapFactory.decodeStream(newInputStream, null, options)
                binding?.imgPhoto?.setImageBitmap(bitmap)
                newInputStream?.close()
            }
        } catch (e: SecurityException) {
            e.printStackTrace()
            Toast.makeText(this, "Permission denied to access this image", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "Failed to load image", Toast.LENGTH_SHORT).show()
        }
    }

    private fun calculateInSampleSize(options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int): Int {
        val (height: Int, width: Int) = options.outHeight to options.outWidth
        var inSampleSize = 1

        if (height > reqHeight || width > reqWidth) {
            val halfHeight: Int = height / 2
            val halfWidth: Int = width / 2

            while (halfHeight / inSampleSize >= reqHeight && halfWidth / inSampleSize >= reqWidth) {
                inSampleSize *= 2
            }
        }
        return inSampleSize
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        getResultLauncher.launch(intent)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun showAlertDialog(type: Int) {
        val isDialogClose = type == ALERT_DIALOG_CLOSE
        val dialogTitle: String
        val dialogMessage: String
        if (isDialogClose) {
            dialogTitle = getString(R.string.cancel)
            dialogMessage = getString(R.string.message_cancel)
        } else {
            dialogMessage = getString(R.string.message_delete)
            dialogTitle = getString(R.string.delete)
        }
        val alertDialogBuilder = AlertDialog.Builder(this)
        with(alertDialogBuilder) {
            setTitle(dialogTitle)
            setMessage(dialogMessage)
            setCancelable(false)
            setPositiveButton(getString(R.string.yes)) { _, _ ->
                if (!isDialogClose) {
                    kebunAddUpdateViewModel.delete(kebun as Kebun)
                    showToast(getString(R.string.deleted))
                }
                finish()
            }
            setNegativeButton(getString(R.string.no)) { dialog, _ -> dialog.cancel() }
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        _activityKebunAddUpdateBinding = null
    }

    private fun obtainViewModel(activity: AppCompatActivity): KebunAddUpdateViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity, factory).get(KebunAddUpdateViewModel::class.java)
    }
}
