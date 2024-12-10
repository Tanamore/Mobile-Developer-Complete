package com.bangkit.tanamoretest.reminder

import android.Manifest
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.media.RingtoneManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.bangkit.tanamoretest.R

class ReminderReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val taskTitle = intent.getStringExtra("taskTitle")

        // URI untuk suara kustom
        val soundUri =  RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        val builder = NotificationCompat.Builder(context, "taskReminderChannel")
            .setSmallIcon(R.drawable.baseline_alarm_24) // Pastikan ikon notifikasi tersedia di drawable
            .setContentTitle("Pengingat Tugas")
            .setContentText("Waktunya untuk: $taskTitle")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setSound(soundUri)
            .setOngoing(true) // Membuat notifikasi terus muncul hingga dihapus secara manual
            .setOnlyAlertOnce(false) // Mengatur agar notifikasi terus berbunyi setiap kali muncul kembali
            .setAutoCancel(false) // Membuat notifikasi tidak hilang otomatis ketika disentuh

        // Cek izin sebelum menampilkan notifikasi jika di Android 13 atau lebih tinggi
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU ||
            ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
            val notificationManager = NotificationManagerCompat.from(context)
            notificationManager.notify(1, builder.build())
        }
    }
}
