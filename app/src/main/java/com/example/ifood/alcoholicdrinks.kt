package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class alcoholicdrinks : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_alcoholicdrinks)
        imageone = findViewById(R.id.konyagi)
        imagetwo = findViewById(R.id.gin)
        imagethree =findViewById(R.id.vodka)


        imageone=findViewById(R.id.konyagi)
        imageone.setOnClickListener{
            val intent=Intent(this,konyagi::class.java )
            startActivity(intent)
            Toast.makeText(this@alcoholicdrinks,"Konyagi",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.gin)
        imagetwo.setOnClickListener{
            val intent=Intent(this,gin::class.java )
            startActivity(intent)
            Toast.makeText(this@alcoholicdrinks,"Chrome Gin",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.vodka)
        imagethree.setOnClickListener{
            val intent=Intent(this,vodka::class.java )
            startActivity(intent)
            Toast.makeText(this@alcoholicdrinks,"Chrome Vodka",Toast.LENGTH_LONG).show()
        }


    }
}


