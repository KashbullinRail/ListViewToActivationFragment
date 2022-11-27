package com.example.listviewtoactivationfragment.model

import java.io.Serializable

data class Cat(
    val id:Int,
    val name:String,
    val discription:String
):Serializable {
    override fun toString(): String {
        return name
    }
}