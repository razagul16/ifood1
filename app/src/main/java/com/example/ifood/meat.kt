package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class meat : AppCompatActivity() {
    lateinit var image1:ImageView
    lateinit var image2:ImageView
    lateinit var image3:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_meat)
        image1 =  findViewById(R.id.drumstick)
        image2 = findViewById(R.id.porkribs)
        image3 =findViewById(R.id.breast)

        image1=findViewById(R.id.drumstick)
        image1.setOnClickListener{
            val intent=Intent(this,drumstick::class.java )
            startActivity(intent)
            Toast.makeText(this@meat,"DrumSticks",Toast.LENGTH_LONG).show()
        }
        image2=findViewById(R.id.porkribs)
        image2.setOnClickListener{
            val intent=Intent(this,porkribs::class.java )
            startActivity(intent)
            Toast.makeText(this@meat,"Pepsi",Toast.LENGTH_LONG).show()
        }
        image3=findViewById(R.id.breast)
        image3.setOnClickListener{
            val intent=Intent(this,breast::class.java )
            startActivity(intent)
            Toast.makeText(this@meat,"Coke Cola",Toast.LENGTH_LONG).show()
        }


    }
}


