package com.bangkit.tanamoretest.ui.kebunku

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bangkit.tanamoretest.ui.kebunku.database.Kebun
import com.bangkit.tanamoretest.ui.kebunku.repositoryKebunku.KebunRepository

class KebunkuViewModel(application: Application) : ViewModel() {
    private val mKebunRepository: KebunRepository = KebunRepository(application)

    // Fungsi untuk mengambil semua catatan kebun
    fun getAllKebun(): LiveData<List<Kebun>> = mKebunRepository.getAllKebun()

    // Fungsi untuk menghapus catatan kebun
    fun deleteKebun(kebun: Kebun) {
        mKebunRepository.delete(kebun)  // Panggil fungsi penghapusan dari repository
    }

}
