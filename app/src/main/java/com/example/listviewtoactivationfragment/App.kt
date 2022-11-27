package com.example.listviewtoactivationfragment

import android.app.Application
import com.example.listviewtoactivationfragment.model.CatsService

class App: Application() {

    val catsService = CatsService()

}