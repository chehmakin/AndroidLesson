package com.example.androidlesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.image
        val button = binding.button

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, 1)
        }

        when(intent.getIntExtra("image", 1)){
            1 -> image.setImageResource(R.drawable.one)
            2 -> image.setImageResource(R.drawable.two)
            3 -> image.setImageResource(R.drawable.three)
        }
    }


}