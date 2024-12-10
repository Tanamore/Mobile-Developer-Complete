package com.bangkit.tanamoretest.ui.kebunku.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.bangkit.tanamoretest.ui.kebunku.database.Kebun
import com.bangkit.tanamoretest.ui.kebunku.repositoryKebunku.KebunRepository

class KebunAddUpdateViewModel(application: Application) : ViewModel() {

    private val mKebunRepository: KebunRepository = KebunRepository(application)

    fun insert(kebun: Kebun) {
        mKebunRepository.insert(kebun)
    }

    fun update(kebun: Kebun) {
        mKebunRepository.update(kebun)
    }

    fun delete(kebun: Kebun) {
        mKebunRepository.delete(kebun)
    }

}