package com.bangkit.tanamoretest.reminder

import Reminder
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.tanamoretest.databinding.LayoutReminderBinding

class ReminderAdapter (
    // Daftar task yang akan ditampilkan
    private val tasks: MutableList<Reminder>,
    // Fungsi callback untuk menghapus task saat tombol delete ditekan
    private val onDeleteTask: (Reminder) -> Unit
) : RecyclerView.Adapter<ReminderAdapter.TaskViewHolder>() {

    // ViewHolder untuk menampilkan item layout task
    inner class TaskViewHolder(val binding: LayoutReminderBinding) :
        RecyclerView.ViewHolder(binding.root)

    // Fungsi untuk membuat ViewHolder baru, layout task akan di-inflate dari file XML ke dalam ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = LayoutReminderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    // Fungsi untuk mengikat data dari sebuah task ke ViewHolder
    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        // Ambil task berdasarkan posisi di daftar
        val task = tasks[position]

        // Memformat jam dan menit untuk memastikan dua digit
        val formattedHour = String.format("%02d", task.hour)  // Memastikan jam memiliki dua digit
        val formattedMinute = String.format("%02d", task.minute)  // Memastikan menit memiliki dua digit


        // Mengikat data task ke komponen UI di layout task
        holder.binding.apply {
            tvReminderTitle.text = task.title
            tvReminderDate.text = task.date
            tvReminderTime.text = "$formattedHour:$formattedMinute"  // Menampilkan jam dengan format dua digit

            // Mengatur aksi klik untuk tombol hapus
            btnDeleteReminder.setOnClickListener {
                onDeleteTask(task) // Memanggil fungsi callback untuk menghapus task
            }
        }
    }

    // Mengembalikan jumlah task dalam daftar
    override fun getItemCount(): Int = tasks.size
}
