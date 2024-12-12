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

        binding.root.setPadding(0, getStatusBarHeight(), 0, 0)

        val sharedPreferences = getSharedPreferences("task_pref", Context.MODE_PRIVATE)
        taskList = loadTaskList(sharedPreferences)

       checkTaskListEmpty()

        taskAdapter = ReminderAdapter(taskList) { task ->
            deleteTask(task, sharedPreferences)
        }
        binding.rvReminderList.layoutManager = LinearLayoutManager(this)
        binding.rvReminderList.adapter = taskAdapter

        binding.btnAddReminder.setOnClickListener {
            startActivity(Intent(this, AddReminderActivity::class.java))
            finish()
        }

        binding.ivBack.setOnClickListener {
            onBackPressed()
        }

        createNotificationChannel()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                requestNotificationPermission()
            }
        }

        binding.btnAddReminder.setOnClickListener {
            val intent = Intent(this, AddReminderActivity::class.java)
            startActivity(intent)
        }
    }

    private fun checkTaskListEmpty() {
        if (taskList.isEmpty()) {
            binding.tvEmptyReminderList.visibility = android.view.View.VISIBLE
            binding.rvReminderList.visibility = android.view.View.GONE
        } else {
            binding.tvEmptyReminderList.visibility = android.view.View.GONE
            binding.rvReminderList.visibility = android.view.View.VISIBLE
        }
    }

    private fun loadTaskList(sharedPreferences: android.content.SharedPreferences): MutableList<Reminder> {
        val gson = Gson()
        val json = sharedPreferences.getString("task_list", null)
        val type = object : TypeToken<MutableList<Reminder>>() {}.type
        return if (json == null) mutableListOf() else gson.fromJson(json, type)
    }

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

    private fun deleteTask(task: Reminder, sharedPreferences: android.content.SharedPreferences) {
        taskList.remove(task)
        if (!taskList.contains(task)) {
            Toast.makeText(this, "Berhasil menghapus reminder", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Gagal menghapus task", Toast.LENGTH_SHORT).show()
        }
        saveTaskList(sharedPreferences, taskList)
        taskAdapter.notifyDataSetChanged()
        checkTaskListEmpty()
    }

    private fun requestNotificationPermission() {
        val requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (!isGranted) {
                }
        }
        requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
    }

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

    private fun getStatusBarHeight(): Int {
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId > 0) resources.getDimensionPixelSize(resourceId) else 0
    }
}
