package com.bangkit.tanamoretest.reminder

import Reminder
import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.DatePickerDialog
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.tanamoretest.R
import com.bangkit.tanamoretest.databinding.ActivityAddReminderBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.Calendar

class AddReminderActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityAddReminderBinding.inflate(layoutInflater)
    }

    private var selectedYear = 0
    private var selectedMonth = 0
    private var selectedDay = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            val intent = Intent(this, ReminderActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.etDatePicker.setOnClickListener {
            val calendar = Calendar.getInstance()
            val datePickerDialog = DatePickerDialog(
                this,
                { _, year, month, dayOfMonth ->
                    binding.etDatePicker.setText("$dayOfMonth/${month + 1}/$year")
                    selectedYear = year
                    selectedMonth = month
                    selectedDay = dayOfMonth
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )
            datePickerDialog.show()
        }

        binding.reminderTypeGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radio_harvest -> {
                    binding.etDatePicker.isEnabled = true
                }
                R.id.radio_water -> {
                    binding.etDatePicker.isEnabled = false
                }
            }
        }

        binding.btnAddTask.setOnClickListener {
            val taskTitle = binding.etTaskTitle.text.toString()
            val selectedDate = if (binding.etDatePicker.isEnabled) binding.etDatePicker.text.toString() else "Hari Ini"
            val selectedHour = binding.timePicker.hour
            val selectedMinute = binding.timePicker.minute
            val reminderType = when (binding.reminderTypeGroup.checkedRadioButtonId) {
                R.id.radio_harvest -> "Panen"
                R.id.radio_water -> "Siram"
                else -> "Tidak Diketahui"
            }

            if (taskTitle.isEmpty() || (binding.etDatePicker.isEnabled && selectedDate.isEmpty())) {
                Toast.makeText(this, "Mohon isi semua data terlebih dahulu", Toast.LENGTH_SHORT).show()
            } else {
                addTask(taskTitle, selectedDate, selectedHour, selectedMinute, reminderType)
            }
        }
    }

    private fun addTask(
        taskTitle: String,
        selectedDate: String,
        selectedHour: Int,
        selectedMinute: Int,
        reminderType: String
    ) {
        val newTask = Reminder(taskTitle, selectedDate, selectedHour, selectedMinute, selectedYear, selectedMonth, selectedDay, reminderType)

        val sharedPreferences = getSharedPreferences("task_pref", Context.MODE_PRIVATE)
        val taskList = loadTaskList(sharedPreferences)

        taskList.add(newTask)
        saveTaskList(sharedPreferences, taskList)

        if (reminderType == "Siram") {
            scheduleDailyNotification(newTask)
        } else {
            scheduleNotification(newTask)
        }

        Toast.makeText(this, "Berhasil menambahkan task: $reminderType", Toast.LENGTH_SHORT).show()

        startActivity(Intent(this, ReminderActivity::class.java))
        finish()
    }

    private fun loadTaskList(sharedPreferences: android.content.SharedPreferences): MutableList<Reminder> {
        val gson = Gson()
        val json = sharedPreferences.getString("task_list", null)
        val type = object : TypeToken<MutableList<Reminder>>() {}.type
        return if (json == null) mutableListOf() else gson.fromJson(json, type)
    }

    private fun saveTaskList(sharedPreferences: android.content.SharedPreferences, taskList: MutableList<Reminder>) {
        val gson = Gson()
        val editor = sharedPreferences.edit()
        val json = gson.toJson(taskList)
        editor.putString("task_list", json)
        editor.apply()
    }

    private fun scheduleNotification(task: Reminder) {
        val intent = Intent(this, ReminderReceiver::class.java).apply {
            putExtra("taskTitle", task.title)
        }

        val pendingIntent = PendingIntent.getBroadcast(
            this,
            task.hashCode(),
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val calendar = Calendar.getInstance().apply {
            set(Calendar.YEAR, task.year)
            set(Calendar.MONTH, task.month)
            set(Calendar.DAY_OF_MONTH, task.day)
            set(Calendar.HOUR_OF_DAY, task.hour)
            set(Calendar.MINUTE, task.minute)
            set(Calendar.SECOND, 0)
        }

        alarmManager.set(
            AlarmManager.RTC_WAKEUP,
            calendar.timeInMillis,
            pendingIntent
        )
    }

    private fun scheduleDailyNotification(task: Reminder) {
        val intent = Intent(this, ReminderReceiver::class.java).apply {
            putExtra("taskTitle", task.title)
        }

        val pendingIntent = PendingIntent.getBroadcast(
            this,
            task.hashCode(),
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, task.hour)
            set(Calendar.MINUTE, task.minute)
            set(Calendar.SECOND, 0)
            if (timeInMillis < System.currentTimeMillis()) {
                add(Calendar.DAY_OF_YEAR, 1)
            }
        }

        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP,
            calendar.timeInMillis,
            AlarmManager.INTERVAL_DAY,
            pendingIntent
        )
    }
}
