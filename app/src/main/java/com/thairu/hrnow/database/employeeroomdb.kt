package com.thairu.hrnow.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.thairu.hrnow.data.Employee
import com.thairu.hrnow.data.EmployeeDAO

@Database(entities = [(Employee::class)], version = 1, exportSchema = false)
abstract class EmployeeRoomDatabase : RoomDatabase() {
    abstract fun employeeDao(): EmployeeDAO

    companion object {
        @Volatile
        private var INSTANCE: EmployeeRoomDatabase? = null

        fun getInstance(context: Context): EmployeeRoomDatabase {
            // Allowing only one thread of execution at a time
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        EmployeeRoomDatabase::class.java,
                        "employee_database"
                    ).fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance

                }
                return instance
            }
        }
    }
}