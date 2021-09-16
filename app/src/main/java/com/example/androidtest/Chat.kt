package com.example.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_AndroidTest)

        setContentView(R.layout.activity_chat)
        setTitle("Chat");
    }
}