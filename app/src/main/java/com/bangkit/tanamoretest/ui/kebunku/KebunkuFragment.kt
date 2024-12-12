package com.bangkit.tanamoretest.ui.kebunku

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bangkit.tanamoretest.databinding.FragmentKebunkuBinding
import com.bangkit.tanamoretest.reminder.ReminderActivity
import com.bangkit.tanamoretest.ui.kebunku.insert.KebunAddUpdateActivity
import com.bangkit.tanamoretest.ui.kebunku.helper.ViewModelFactory

class KebunkuFragment : Fragment() {

    private var _binding: FragmentKebunkuBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: KebunAdapter
    private lateinit var mainViewModel: KebunkuViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentKebunkuBinding.inflate(inflater, container, false)
        val root: View = binding.root

        mainViewModel = obtainViewModel()

        adapter = KebunAdapter(mainViewModel)

        binding.rvKebun.layoutManager = LinearLayoutManager(requireContext())
        binding.rvKebun.setHasFixedSize(true)
        binding.rvKebun.adapter = adapter

        mainViewModel.getAllKebun().observe(viewLifecycleOwner) { noteList ->
            if (noteList != null) {
                adapter.setListKebun(noteList)
            }
        }

        binding.fabAdd.setOnClickListener {
            val intent = Intent(requireContext(), KebunAddUpdateActivity::class.java)
            startActivity(intent)
        }

        binding.ivBell.setOnClickListener {
            val intent = Intent(requireContext(), ReminderActivity::class.java)
            startActivity(intent)
        }

        return root
    }

    private fun obtainViewModel(): KebunkuViewModel {
        val factory = ViewModelFactory.getInstance(requireActivity().application)
        return ViewModelProvider(this, factory).get(KebunkuViewModel::class.java)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
