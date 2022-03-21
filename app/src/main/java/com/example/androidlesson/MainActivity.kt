package com.example.androidlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.homework.TestData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class MainActivity : AppCompatActivity() {
    companion object{
        private const val FILE_NAME = "7_занятие_ДЗ_Многопоточность_Irlix.json"
        const val IS_COMPLETED = "IS_COMPLETED"
        private var isCompleted: Boolean = false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        threadWay()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean(IS_COMPLETED, isCompleted)
    }

    private fun threadWay(){
        if (!isCompleted) {
            try {
                Thread {
                    Thread.sleep(5000)
                    isCompleted = true
                    Log.d("qqq", getJson().toString())
                }.start()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }

    }

    private fun getJson():List<TestData>{
        var jsonString = ""
        try {
            jsonString = assets.open(FILE_NAME).bufferedReader().use { it.readText() }

        }catch (ex:IOException){
            Log.e("IOE", ex.message.toString())
        }

        val listArticleType = object : TypeToken<List<TestData>>() {}.type
        return Gson().fromJson(jsonString, listArticleType)

    }

}