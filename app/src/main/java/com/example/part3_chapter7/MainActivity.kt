package com.example.part3_chapter7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.part3_chapter7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            view = this@MainActivity
        }


    }

    fun onClickAdd(){

    }
}