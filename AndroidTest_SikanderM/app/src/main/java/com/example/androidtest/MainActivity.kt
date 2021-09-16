

package com.example.androidtest

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_AndroidTest)
        setContentView(R.layout.activity_main)
        setTitle("Coding Tasks")

        button.setOnClickListener {
            val Intent = Intent(this, Chat::class.java)
            startActivity(Intent)
        }

        button2.setOnClickListener {
            val Intent = Intent(this, Login::class.java)
            startActivity(Intent)
        }

        button3.setOnClickListener {
            val Intent = Intent(this, Animation::class.java)
            startActivity(Intent)
        }


        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        //binding.button.text = "CHAT"
       // binding.button.text = "LOGIN"
       // binding.button.text = "ANIMATION"
    }
}