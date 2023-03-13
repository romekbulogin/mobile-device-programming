package ru.edu.myapplication.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class DatabaseService(context: Context) {
    private val databaseHelper = DatabaseHelper(context)
    private var database: SQLiteDatabase? = null

    fun createConnection() {
        database = databaseHelper.writableDatabase
    }

    fun insertToLoginTable(username: String, browser: String, token: String) {
        val values = ContentValues().apply {
            put(Database.COLUMN_NAME_USERNAME, username)
            put(Database.COLUMN_NAME_BROWSER, browser)
            put(Database.COLUMN_NAME_TOKEN, token)
        }
        database?.insert(Database.TABLE_NAME, null, values)
        database?.close()
    }
}