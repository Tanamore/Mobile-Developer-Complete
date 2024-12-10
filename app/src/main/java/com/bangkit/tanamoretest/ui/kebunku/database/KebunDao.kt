package com.bangkit.tanamoretest.ui.kebunku.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

@Dao
interface KebunDao {
    @Insert
    fun insert(kebun: Kebun)

    @Update
    fun update(kebun: Kebun)

    @Delete
    fun delete(kebun: Kebun)

    @Query("SELECT * FROM Kebun")
    fun getAllKebun(): LiveData<List<Kebun>>
}
