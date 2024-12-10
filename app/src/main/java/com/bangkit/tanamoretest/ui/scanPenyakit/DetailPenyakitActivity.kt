package com.bangkit.tanamoretest.ui.scanPenyakit

import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.tanamoretest.R
import com.bangkit.tanamoretest.databinding.ActivityDetailPenyakitBinding
import com.bangkit.tanamoretest.response.DiseaseInfo
import com.bumptech.glide.Glide

class DetailPenyakitActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailPenyakitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPenyakitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getStringExtra("ANALYSIS_RESULT")
        val confidence = intent.getStringExtra("CONFIDENCE")
        val diseaseInfo: DiseaseInfo? = intent.getParcelableExtra("DISEASE_INFO")
        val imageUri = intent.getStringExtra("IMAGE_URI")

        // Memuat gambar jika URI valid
        imageUri?.let {
            Glide.with(this)
                .load(Uri.parse(it))
                .placeholder(R.drawable.ic_placeholder)
                .into(binding.analyzedImage)
        }

        binding.result.text = result ?: "No result"
        binding.confidence.text = "Confidence: ${confidence ?: "N/A"}" // Menangani null dengan default "N/A"

        // Memuat data penyakit
        diseaseInfo?.let {
            binding.diseaseName.text = it.diseaseName ?: "Unknown Disease"
            binding.symptoms.text = "Gejala Penyakit: ${it.symptoms ?: "Tidak ada gejala"}"
            binding.treatment.text = "Saran Pengobatan: ${it.treatment ?: "Tidak ada saran"}"
            binding.preventionTips.text = "Pencegahan: ${it.preventionTips ?: "Tidak ada pencegahan"}"
            binding.causes.text = "Penyebab Penyakit: ${it.causes ?: "Tidak ada penyebab"}"
        } ?: run {
            binding.diseaseName.text = "No disease information"
        }

        binding.icBack.setOnClickListener {
            finish()
        }
    }
}