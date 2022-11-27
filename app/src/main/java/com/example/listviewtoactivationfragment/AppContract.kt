package com.example.listviewtoactivationfragment

import androidx.fragment.app.Fragment
import com.example.listviewtoactivationfragment.model.Cat
import com.example.listviewtoactivationfragment.model.CatsService

fun Fragment.contract(): AppContract = requireActivity() as AppContract

interface AppContract {

        val catsService:CatsService

        fun openCatDetailScreen(cat:Cat)

}