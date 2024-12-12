package com.bangkit.tanamoretest.reminder

import Reminder
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.tanamoretest.databinding.LayoutReminderBinding

class ReminderAdapter (
    private val tasks: MutableList<Reminder>,
    private val onDeleteTask: (Reminder) -> Unit
) : RecyclerView.Adapter<ReminderAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(val binding: LayoutReminderBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = LayoutReminderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasks[position]

        val formattedHour = String.format("%02d", task.hour)
        val formattedMinute = String.format("%02d", task.minute)


        holder.binding.apply {
            tvReminderTitle.text = task.title
            tvReminderDate.text = task.date
            tvReminderTime.text = "$formattedHour:$formattedMinute"

            btnDeleteReminder.setOnClickListener {
                onDeleteTask(task)
            }
        }
    }

    override fun getItemCount(): Int = tasks.size
}
