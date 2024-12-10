package com.bangkit.tanamoretest.splashScreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.tanamoretest.R
import com.google.android.material.button.MaterialButton

class SplashScreenActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)

        // Tombol Next untuk berpindah ke SplashScreenActivity2
        val nextButton = findViewById<MaterialButton>(R.id.btn_next)
        nextButton.setOnClickListener {
            // Pindah ke SplashScreenActivity2
            Intent(this, SplashScreenActivity3::class.java).also {
                startActivity(it)
                finish() // Tutup SplashScreenActivity agar tidak kembali lagi
            }
        }
    }
}