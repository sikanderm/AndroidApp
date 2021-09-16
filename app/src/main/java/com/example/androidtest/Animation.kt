package com.example.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_AndroidTest)
        setContentView(R.layout.activity_animation)
        setTitle("Animation");

    }
}