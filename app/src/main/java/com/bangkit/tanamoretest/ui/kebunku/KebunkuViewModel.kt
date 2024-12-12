package com.bangkit.tanamoretest.ui.kebunku

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bangkit.tanamoretest.ui.kebunku.database.Kebun
import com.bangkit.tanamoretest.ui.kebunku.repositoryKebunku.KebunRepository

class KebunkuViewModel(application: Application) : ViewModel() {
    private val mKebunRepository: KebunRepository = KebunRepository(application)

    fun getAllKebun(): LiveData<List<Kebun>> = mKebunRepository.getAllKebun()

    fun deleteKebun(kebun: Kebun) {
        mKebunRepository.delete(kebun)
    }

}
