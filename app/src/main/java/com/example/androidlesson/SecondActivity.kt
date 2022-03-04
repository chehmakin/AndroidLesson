package com.example.androidlesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlesson.databinding.ActivityMainBinding
import com.example.androidlesson.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.oneBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("image", 1)
            }
        }

        binding.twoBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("image", 2)
            }
        }

        binding.threeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("image", 3)
            }
        }
    }


}