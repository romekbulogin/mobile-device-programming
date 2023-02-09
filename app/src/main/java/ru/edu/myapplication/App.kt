package ru.edu.myapplication

import android.app.Application
import ru.edu.myapplication.service.DatabaseService

class App : Application() {
    val databaseService = DatabaseService()
}