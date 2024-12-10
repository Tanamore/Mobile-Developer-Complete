package com.bangkit.tanamoretest.ui.profile

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bangkit.tanamoretest.login.LoginActivity
import com.bangkit.tanamoretest.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private lateinit var auth: FirebaseAuth
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()
        val user = auth.currentUser

        if (user != null) {
            // Set user data into EditText
            binding.etName.setText(user.displayName)
            binding.etEmail.setText(user.email)

            // Handle email verification status
            if (user.isEmailVerified) {
                binding.ivVerified.visibility = View.VISIBLE
                binding.ivUnverified.visibility = View.INVISIBLE
            } else {
                binding.ivUnverified.visibility = View.VISIBLE
                binding.ivVerified.visibility = View.INVISIBLE
            }
        }

        // Update profile when Save button is clicked
        binding.btnUpdate.setOnClickListener {
            val name = binding.etName.text.toString().trim()
            if (name.isEmpty()) {
                binding.etName.error = "Nama harus di isi"
                binding.etName.requestFocus()
                return@setOnClickListener
            }

            val userProfileChangeRequest = UserProfileChangeRequest.Builder()
                .setDisplayName(name)
                .build()

            user?.updateProfile(userProfileChangeRequest)?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Save name to SharedPreferences
                    val sharedPreferences = requireContext().getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
                    val editor = sharedPreferences.edit()
                    editor.putString("userName", name)  // Save updated name
                    editor.apply()

                    Toast.makeText(activity, "Berhasil update", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(activity, "Gagal update", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.btnVerification.setOnClickListener {
            user?.sendEmailVerification()?.addOnCompleteListener {
            if (it.isSuccessful) {
                Toast.makeText(activity, "Email verifikasi telah dikirin", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(activity, "${it.exception?.message}", Toast.LENGTH_SHORT).show()

            }
            }
        }


        binding.btnUpdatePassword.setOnClickListener {
            Intent(context, UpdatePasswordActivity::class.java).also {
                startActivity(it)
            }
        }

        // Logout and clear user data
        binding.btnLogout.setOnClickListener {
            auth.signOut()

            // Clear the user data stored in SharedPreferences
            val sharedPreferences = requireContext().getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.remove("userName")  // Remove the stored name
            editor.apply()

            // Navigate to the login activity
            val intent = Intent(context, LoginActivity::class.java)
            startActivity(intent)
            requireActivity().finish()  // Finish the current activity to remove it from the back stack
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
