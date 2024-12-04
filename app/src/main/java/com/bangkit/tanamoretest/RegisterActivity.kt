package com.bangkit.tanamoretest

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.tanamoretest.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        // Button Register
        binding.btnRegister.setOnClickListener {
            val email = binding.email.text.toString().trim()
            val password = binding.password.text.toString().trim()
            val phoneNumber = binding.phoneNumber.text.toString().trim()

            // Validasi email
            if (email.isEmpty()) {
                binding.email.error = "Email harus diisi"
                binding.email.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.email.error = "Email tidak valid!"
                binding.email.requestFocus()
                return@setOnClickListener
            }

            // Validasi password
            if (password.isEmpty() || password.length < 8) {
                binding.password.error = "Password harus lebih dari 8 karakter"
                binding.password.requestFocus()
                return@setOnClickListener
            }

            // Validasi nomor telepon
            if (phoneNumber.isEmpty() || phoneNumber.length < 10) {
                binding.phoneNumber.error = "Nomor telepon tidak valid"
                binding.phoneNumber.requestFocus()
                return@setOnClickListener
            }

            // Panggil fungsi registrasi
            registerUser(email, password)
        }

        // Button Login untuk navigasi ke halaman login
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        }
    }

    // Fungsi untuk registrasi pengguna
    private fun registerUser(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show()

                    // Pindah ke MainActivity setelah registrasi berhasil
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish() // Menutup RegisterActivity agar tidak kembali ke halaman register
                } else {
                    // Menampilkan pesan error jika registrasi gagal
                    Toast.makeText(
                        this,
                        "Error: ${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }

    // Cek jika user sudah login
    override fun onStart() {
        super.onStart()
        if (auth.currentUser != null) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup RegisterActivity agar tidak kembali ke halaman register
        }
    }
}
