package com.example.listviewtoactivationfragment.model

data class Cat(
    val id:Int,
    val name:String,
    val discription:String
){
    override fun toString(): String {
        return name
    }
}