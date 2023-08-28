package com.example.spicyfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    lateinit var backBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        backBtn = findViewById(R.id.btnGoBack)

        backBtn.setOnClickListener {
            finish()
        }
    }
}