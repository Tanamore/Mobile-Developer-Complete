package com.bangkit.tanamoretest

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.tanamoretest.login.LoginActivity
import com.google.firebase.auth.FirebaseAuth

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Inisialisasi FirebaseAuth
        auth = FirebaseAuth.getInstance()

        // Handler untuk menunggu beberapa detik sebelum berpindah Activity
        Handler(Looper.getMainLooper()).postDelayed({
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
                    finish()
                }
            }
        }, 2000) // Delay 2000ms (2 detik)
    }
}
