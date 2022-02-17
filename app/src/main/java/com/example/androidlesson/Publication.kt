package com.example.androidlesson

interface Publication {
    val price:Int
    val wordCount:Int

    fun getType():String
}