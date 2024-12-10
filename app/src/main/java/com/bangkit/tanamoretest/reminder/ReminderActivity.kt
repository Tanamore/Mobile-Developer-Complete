package com.bangkit.tanamoretest.reminder

import Reminder
import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bangkit.tanamoretest.R
import com.bangkit.tanamoretest.databinding.ActivityReminderBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ReminderActivity : AppCompatActivity() {

    private lateinit var taskAdapter: ReminderAdapter
    private lateinit var taskList: MutableList<Reminder>

    private val binding by lazy {
        ActivityReminderBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        // Tambahkan padding untuk menghindari tampilan dekat dengan bagian atas layar
        binding.root.setPadding(0, getStatusBarHeight(), 0, 0)

        // Load daftar task dari SharedPreferences
        val sharedPreferences = getSharedPreferences("task_pref", Context.MODE_PRIVATE)
        taskList = loadTaskList(sharedPreferences)

        // Periksa apakah daftar task kosong
        checkTaskListEmpty()

        // Set RecyclerView dengan taskAdapter
        taskAdapter = ReminderAdapter(taskList) { task ->
            deleteTask(task, sharedPreferences)
        }
        binding.rvReminderList.layoutManager = LinearLayoutManager(this)
        binding.rvReminderList.adapter = taskAdapter

        // Tombol untuk menambah task baru
        binding.btnAddReminder.setOnClickListener {
            startActivity(Intent(this, AddReminderActivity::class.java))
            finish()
        }

        // Tombol untuk kembali ke fragmen Kebunku
        binding.ivBack.setOnClickListener {
            onBackPressed()
        }

        createNotificationChannel()

        // Meminta izin POST_NOTIFICATIONS jika di Android 13 atau lebih tinggi
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                requestNotificationPermission()
            }
        }

        // Pindah ke AddTaskActivity ketika tombol Add Task ditekan
        binding.btnAddReminder.setOnClickListener {
            val intent = Intent(this, AddReminderActivity::class.java)
            startActivity(intent)
        }
    }

    // Fungsi untuk memeriksa apakah taskList kosong
    private fun checkTaskListEmpty() {
        if (taskList.isEmpty()) {
            // Jika taskList kosong, tampilkan pesan dan sembunyikan RecyclerView
            binding.tvEmptyReminderList.visibility = android.view.View.VISIBLE
            binding.rvReminderList.visibility = android.view.View.GONE
        } else {
            // Jika taskList tidak kosong, tampilkan RecyclerView dan sembunyikan pesan
            binding.tvEmptyReminderList.visibility = android.view.View.GONE
            binding.rvReminderList.visibility = android.view.View.VISIBLE
        }
    }

    // Fungsi untuk memuat daftar task dari SharedPreferences
    private fun loadTaskList(sharedPreferences: android.content.SharedPreferences): MutableList<Reminder> {
        val gson = Gson()
        val json = sharedPreferences.getString("task_list", null)
        val type = object : TypeToken<MutableList<Reminder>>() {}.type
        return if (json == null) mutableListOf() else gson.fromJson(json, type)
    }

    // Fungsi untuk menyimpan daftar task ke SharedPreferences
    private fun saveTaskList(
        sharedPreferences: android.content.SharedPreferences,
        taskList: MutableList<Reminder>
    ) {
        val gson = Gson()
        val editor = sharedPreferences.edit()
        val json = gson.toJson(taskList)
        editor.putString("task_list", json)
        editor.apply()
    }

    // Fungsi untuk menghapus task dari daftar
    private fun deleteTask(task: Reminder, sharedPreferences: android.content.SharedPreferences) {
        taskList.remove(task)
        // Cek apakah task berhasil dihapus
        if (!taskList.contains(task)) {
            Toast.makeText(this, "Berhasil menghapus reminder", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Gagal menghapus task", Toast.LENGTH_SHORT).show()
        }
        saveTaskList(sharedPreferences, taskList)
        taskAdapter.notifyDataSetChanged()
        // Periksa lagi apakah taskList kosong setelah penghapusan
        checkTaskListEmpty()
    }

    private fun requestNotificationPermission() {
        val requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (!isGranted) {
                // Tampilkan pesan atau log jika izin tidak diberikan oleh pengguna
            }
        }
        requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
    }

    // Fungsi untuk membuat Notification Channel
    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "TaskReminderChannel"
            val descriptionText = "Channel untuk pengingat tugas"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel("taskReminderChannel", name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    // Fungsi untuk mendapatkan tinggi status bar (untuk padding)
    private fun getStatusBarHeight(): Int {
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId > 0) resources.getDimensionPixelSize(resourceId) else 0
    }
}
