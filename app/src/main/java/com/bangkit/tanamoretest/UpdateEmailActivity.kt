package com.bangkit.tanamoretest

import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.tanamoretest.databinding.ActivityUpdateEmailBinding
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.appcheck.FirebaseAppCheck
import com.google.firebase.appcheck.playintegrity.PlayIntegrityAppCheckProviderFactory

class UpdateEmailActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var updateEmailBinding: ActivityUpdateEmailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi Firebase App Check
        val firebaseAppCheck = FirebaseAppCheck.getInstance()
        firebaseAppCheck.installAppCheckProviderFactory(
            PlayIntegrityAppCheckProviderFactory.getInstance()
        )

        updateEmailBinding = ActivityUpdateEmailBinding.inflate(layoutInflater)
        setContentView(updateEmailBinding.root)

        auth = FirebaseAuth.getInstance()
        val user = auth.currentUser

        updateEmailBinding.layoutVerificationPassword.visibility = View.VISIBLE
        updateEmailBinding.layoutUpdateEmail.visibility = View.GONE

        updateEmailBinding.btnAuth.setOnClickListener {
            val pass = updateEmailBinding.etPassword.text.toString().trim()
            if (pass.isEmpty()) {
                updateEmailBinding.etPassword.error = "pass empty!"
                updateEmailBinding.etPassword.requestFocus()
                return@setOnClickListener
            }
            user?.let {
                val userCredential = EmailAuthProvider.getCredential(it.email!!, pass)
                it.reauthenticate(userCredential).addOnCompleteListener { task ->
                    when {
                        task.isSuccessful -> {
                            updateEmailBinding.layoutVerificationPassword.visibility = View.GONE
                            updateEmailBinding.layoutUpdateEmail.visibility = View.VISIBLE
                        }
                        task.exception is FirebaseAuthInvalidCredentialsException -> {
                            updateEmailBinding.etPassword.error = "wrong pass!"
                            updateEmailBinding.etPassword.requestFocus()
                        }
                        else -> {
                            Toast.makeText(
                                applicationContext,
                                "${task.exception?.message}",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            }
        }

        updateEmailBinding.btnUpdate.setOnClickListener updateEmail@{
            val email = updateEmailBinding.etEmail.text.toString().trim()
            if (email.isEmpty()) {
                updateEmailBinding.etEmail.error = "email empty!"
                updateEmailBinding.etEmail.requestFocus()
                return@updateEmail
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                updateEmailBinding.etEmail.error = "invalid email!"
                updateEmailBinding.etEmail.requestFocus()
                return@updateEmail
            }
            user?.let {
                user.updateEmail(email).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(
                            applicationContext,
                            "Email updated!",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "${it.exception?.message}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
    }
}
