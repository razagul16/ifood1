package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.ifood.R
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {
    lateinit var signuptext:TextView
    lateinit var usernametext:EditText
    lateinit var emailtext:EditText
    lateinit var password:EditText
    lateinit var firebaseAuth:FirebaseAuth
    lateinit var login:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login = findViewById(R.id.login_btn)
        emailtext = findViewById(R.id.loginemail)
        usernametext = findViewById(R.id.loginusername)
        firebaseAuth = FirebaseAuth.getInstance()
        password = findViewById(R.id.loginpassword)
        signuptext = findViewById(R.id.signup)
        signuptext.setOnClickListener {
            startActivity(Intent(this, signup::class.java))
        }
        login.setOnClickListener {
            login()
        }

    }


        private fun login() {


            val email = emailtext.text.toString()
            val pass = password.text.toString()
            // calling signInWithEmailAndPassword(email, pass)
            // function using Firebase auth object
            // On successful response Display a Toast
            firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "login succsessful", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, modeofpayment::class.java))

                } else
                    Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
            }



            }
    }
