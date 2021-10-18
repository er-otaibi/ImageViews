package com.example.imageviewsbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var imgView = findViewById<ImageView>(R.id.imgView)

        btn1.setOnClickListener {
            imgView.setImageResource(R.drawable.f)
        }

        btn2.setOnClickListener {
            imgView.setImageResource(R.drawable.m)
        }
    }
}

