package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.ifood.R
import com.example.ifood.modeofpayment
import com.google.firebase.auth.FirebaseAuth

class signup : AppCompatActivity() {
    lateinit var username: EditText
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var confirmpass: EditText
    lateinit var signup: Button
    lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_signup)

        username = findViewById(R.id.signupusername)
        email = findViewById(R.id.signupemail)
        password = findViewById(R.id.signupPassword)
        confirmpass = findViewById(R.id.signupconfirmPassword2)
        signup = findViewById(R.id.signup_btn)
        auth = FirebaseAuth.getInstance()
        signup.setOnClickListener {
            signupuser()
        }

    }


    private fun signupuser() {
        val email = email.text.toString()
        val pass = password.text.toString()
        val confirmPassword = confirmpass.text.toString()

        // check pass
        if (email.isBlank() || pass.isBlank() || confirmPassword.isBlank()) {
            Toast.makeText(this, "Email and Password can't be blank", Toast.LENGTH_SHORT).show()
            return
        }

        if (pass != confirmPassword) {
            Toast.makeText(
                this,
                "Password and Confirm Password do not match",
                Toast.LENGTH_SHORT
            )
                .show()
            return
        }
        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully Signed Up", Toast.LENGTH_SHORT).show()
                finish()
                val intent = Intent(this,modeofpayment::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Sign Up Failed!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}