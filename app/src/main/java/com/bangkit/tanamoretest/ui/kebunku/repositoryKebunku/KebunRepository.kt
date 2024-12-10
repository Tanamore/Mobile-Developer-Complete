package com.bangkit.tanamoretest.ui.kebunku.repositoryKebunku

import android.app.Application
import androidx.lifecycle.LiveData
import com.bangkit.tanamoretest.ui.kebunku.database.Kebun
import com.bangkit.tanamoretest.ui.kebunku.database.KebunDao
import com.bangkit.tanamoretest.ui.kebunku.database.KebunRoomDatabase
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class KebunRepository(application: Application) {
    private val mKebunDao: KebunDao
    private val executorService: ExecutorService = Executors.newSingleThreadExecutor()

    init {
        val db = KebunRoomDatabase.getDatabase(application)
        mKebunDao = db.kebunDao()
    }

    fun getAllKebun(): LiveData<List<Kebun>> = mKebunDao.getAllKebun()

    fun insert(kebun: Kebun) {
        executorService.execute { mKebunDao.insert(kebun) }
    }

    fun delete(kebun: Kebun) {
        executorService.execute { mKebunDao.delete(kebun) }
    }

    fun update(kebun: Kebun) {
        executorService.execute { mKebunDao.update(kebun) }
    }
}