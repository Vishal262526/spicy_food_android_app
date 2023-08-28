package com.example.spicyfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var loginBtn: Button
    lateinit var signupBtn: Button
    lateinit var emailEt: EditText
    lateinit var passwordEt: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn = findViewById(R.id.btnLogin)
        signupBtn = findViewById(R.id.btnSignup)

        signupBtn.setOnClickListener {
            val activity = Intent(this@MainActivity, SignupActivity::class.java)
            startActivity(activity)
        }

        loginBtn.setOnClickListener {
            val activity = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(activity)
        }
    }
}