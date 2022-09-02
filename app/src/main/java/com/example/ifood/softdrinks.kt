package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class softdrinks : AppCompatActivity() {
    lateinit var image1:ImageView
    lateinit var image2:ImageView
    lateinit var image3:ImageView
    lateinit var image4:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_softdrinks)
        image1 =  findViewById(R.id.fanta)
        image2 = findViewById(R.id.pepsi)
        image3 =findViewById(R.id.coke)
        image4 =findViewById(R.id.sprite)

        image1=findViewById(R.id.fanta)
        image1.setOnClickListener{
            val intent=Intent(this,fanta::class.java )
            startActivity(intent)
            Toast.makeText(this@softdrinks,"Fanta",Toast.LENGTH_LONG).show()
        }
        image2=findViewById(R.id.pepsi)
        image2.setOnClickListener{
            val intent=Intent(this,pepsi::class.java )
            startActivity(intent)
            Toast.makeText(this@softdrinks,"Pepsi",Toast.LENGTH_LONG).show()
        }
        image3=findViewById(R.id.coke)
        image3.setOnClickListener{
            val intent=Intent(this,coke::class.java )
            startActivity(intent)
            Toast.makeText(this@softdrinks,"Coke Cola",Toast.LENGTH_LONG).show()
        }
        image4=findViewById(R.id.sprite)
        image4.setOnClickListener{
            val intent=Intent(this,sprite::class.java )
            startActivity(intent)
            Toast.makeText(this@softdrinks,"Sprite",Toast.LENGTH_LONG).show()
        }


    }
}


