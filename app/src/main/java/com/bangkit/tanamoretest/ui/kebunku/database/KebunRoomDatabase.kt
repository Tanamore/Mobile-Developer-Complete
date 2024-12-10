package com.bangkit.tanamoretest.ui.kebunku.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [Kebun::class], version = 1)
abstract class KebunRoomDatabase : RoomDatabase() {

    abstract fun kebunDao(): KebunDao

    companion object {
        @Volatile
        private var INSTANCE: KebunRoomDatabase? = null

        @JvmStatic
        fun getDatabase(context: Context): KebunRoomDatabase {
            if (INSTANCE == null) {
                synchronized(KebunRoomDatabase::class.java) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        KebunRoomDatabase::class.java,
                        "kebun_database"
                    )
                        .addMigrations(MIGRATION_1_2)
                        .build()
                }
            }
            return INSTANCE as KebunRoomDatabase
        }

        private val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE Kebun ADD COLUMN image_path TEXT")
            }
        }

    }
}
