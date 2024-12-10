package com.bangkit.tanamoretest.splashScreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.tanamoretest.MainActivity
import com.bangkit.tanamoretest.R
import com.bangkit.tanamoretest.login.LoginActivity
import com.google.android.material.button.MaterialButton
import com.google.firebase.auth.FirebaseAuth

class SplashScreenActivity3 : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen3
        )

        // Inisialisasi FirebaseAuth
        auth = FirebaseAuth.getInstance()

        // Tombol Next untuk berpindah ke layar berikutnya
        val nextButton = findViewById<MaterialButton>(R.id.btn_next)
        nextButton.setOnClickListener {
            // Cek apakah user sudah login
            if (auth.currentUser != null) {
                // Jika sudah login, arahkan ke MainActivity
                Intent(this, MainActivity::class.java).also {
                    startActivity(it)
                    finish() // Tutup SplashScreen agar tidak kembali lagi
                }
            } else {
                // Jika belum login, arahkan ke LoginActivity
                Intent(this, LoginActivity::class.java).also {
                    startActivity(it)
                    finish() // Tutup SplashScreen agar tidak kembali lagi
                }
            }
        }
    }
}
