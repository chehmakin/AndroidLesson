package com.example.androidlesson

import java.text.SimpleDateFormat
import java.util.*

data class User(
    val id: Int,
    val name: String,
    val age: Int,
    val type: Type,

){
    val startTime:String by lazy {
        val format = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        format.format(Date())
    }
}
