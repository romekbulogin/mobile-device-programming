package ru.edu.myapplication.database

import android.provider.BaseColumns

object Database : BaseColumns {
    const val TABLE_NAME = "login"
    const val COLUMN_NAME_USERNAME = "username"
    const val COLUMN_NAME_BROWSER = "browser"
    const val COLUMN_NAME_TOKEN = "token"


    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "LoginsDatabase"

    const val CREATE_TABLE = "CREATE TABLE $TABLE_NAME (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, " +
            "$COLUMN_NAME_USERNAME TEXT, " +
            "$COLUMN_NAME_BROWSER TEXT, " +
            "$COLUMN_NAME_TOKEN TEXT)"
    const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS $TABLE_NAME"
}