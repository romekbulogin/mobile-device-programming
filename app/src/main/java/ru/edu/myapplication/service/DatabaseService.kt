package ru.edu.myapplication.service

import android.provider.ContactsContract.Data
import ru.edu.myapplication.dto.Database

class DatabaseService {
    private var databaseList = mutableListOf<Database>()

    init {

        databaseList = (1..50).map {
            Database(
                dbms = "PostgreSQL",
                datbase = "TEST"
            )
        }.toMutableList()
    }
}