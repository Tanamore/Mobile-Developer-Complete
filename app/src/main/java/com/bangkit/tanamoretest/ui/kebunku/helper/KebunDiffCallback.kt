package com.bangkit.tanamoretest.ui.kebunku.helper

import androidx.recyclerview.widget.DiffUtil
import com.bangkit.tanamoretest.ui.kebunku.database.Kebun

class KebunDiffCallback(private val oldKebunList: List<Kebun>, private val newKebunList: List<Kebun>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldKebunList.size
    override fun getNewListSize(): Int = newKebunList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldKebunList[oldItemPosition].id == newKebunList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldKebun = oldKebunList[oldItemPosition]
        val newKebun = newKebunList[newItemPosition]

        return oldKebun.title == newKebun.title &&
                oldKebun.description == newKebun.description &&
                oldKebun.imagePath == newKebun.imagePath
    }
}
