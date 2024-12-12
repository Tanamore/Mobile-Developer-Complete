package com.bangkit.tanamoretest.ui.kebunku

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.tanamoretest.R
import com.bangkit.tanamoretest.databinding.ItemKebunBinding
import com.bangkit.tanamoretest.ui.kebunku.database.Kebun
import com.bangkit.tanamoretest.ui.kebunku.helper.KebunDiffCallback
import com.bangkit.tanamoretest.ui.kebunku.insert.KebunAddUpdateActivity
import com.bumptech.glide.Glide

class KebunAdapter(private val kebunkuViewModel: KebunkuViewModel) : RecyclerView.Adapter<KebunAdapter.KebunViewHolder>() {
    private val listKebun = ArrayList<Kebun>()

    fun setListKebun(listNotes: List<Kebun>) {
        val diffCallback = KebunDiffCallback(this.listKebun, listNotes)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.listKebun.clear()
        this.listKebun.addAll(listNotes)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KebunViewHolder {
        val binding = ItemKebunBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KebunViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KebunViewHolder, position: Int) {
        holder.bind(listKebun[position])
    }

    override fun getItemCount(): Int {
        return listKebun.size
    }

    inner class KebunViewHolder(private val binding: ItemKebunBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(kebun: Kebun) {
            with(binding) {
                tvItemTitle.text = kebun.title

                val description = kebun.description ?: ""
                val maxLength = 200
                val shortDescription = if (description.length > maxLength) {
                    "${description.substring(0, maxLength)}"
                } else {
                    description
                }
                tvItemDescription.text = shortDescription

                kebun.imagePath?.let {
                    Glide.with(itemView.context)
                        .load(Uri.parse(it))
                        .into(imgPhoto)
                } ?: run {
                    imgPhoto.setImageResource(R.drawable.ic_launcher_background)
                }

                cvItemNote.setOnClickListener {
                    val intent = Intent(it.context, KebunAddUpdateActivity::class.java)
                    intent.putExtra(KebunAddUpdateActivity.EXTRA_NOTE, kebun)
                    it.context.startActivity(intent)
                }

                imgDelete.setOnClickListener {
                    kebunkuViewModel.deleteKebun(kebun)
                }

            }
        }
    }
}
