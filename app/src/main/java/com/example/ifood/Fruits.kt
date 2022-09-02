package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class Fruits : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView
    lateinit var imagefour:ImageView
    lateinit var imagefive:ImageView
    lateinit var imagesix:ImageView
    lateinit var imageseven:ImageView
    lateinit var imageeight:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_fruits)
        imageone = findViewById(R.id.apple)
        imagetwo = findViewById(R.id.avacado)
        imagethree =findViewById(R.id.watermelon)
        imagefour =findViewById(R.id.pineapple)
        imagefive =findViewById(R.id.grape)
        imagesix = findViewById(R.id.orange)
        imageseven = findViewById(R.id.banana)
        imageeight = findViewById(R.id.mango)

        imageone=findViewById(R.id.apple)
        imageone.setOnClickListener{
            val intent=Intent(this,apple::class.java )
            startActivity(intent)
            Toast.makeText(this@Fruits,"Apple",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.avacado)
        imagetwo.setOnClickListener{
            val intent=Intent(this,avacado::class.java )
            startActivity(intent)
            Toast.makeText(this@Fruits,"Avacado",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.watermelon)
        imagethree.setOnClickListener{
            val intent=Intent(this,watermelon::class.java )
            startActivity(intent)
            Toast.makeText(this@Fruits,"Watermelon ",Toast.LENGTH_LONG).show()
        }
        imagefour=findViewById(R.id.pineapple)
        imagefour.setOnClickListener{
            val intent=Intent(this,pineapple::class.java )
            startActivity(intent)
            Toast.makeText(this@Fruits,"Pineapple",Toast.LENGTH_LONG).show()
        }
        imagefive=findViewById(R.id.mango)
        imagefive.setOnClickListener{
            val intent=Intent(this,mango::class.java )
            startActivity(intent)
            Toast.makeText(this@Fruits,"Mango",Toast.LENGTH_LONG).show()
        }
        imagesix=findViewById(R.id.apple)
        imagesix.setOnClickListener{
            val intent=Intent(this,apple::class.java )
            startActivity(intent)
            Toast.makeText(this@Fruits,"Apple",Toast.LENGTH_LONG).show()
        }
        imageseven=findViewById(R.id.apple)
        imageseven.setOnClickListener{
            val intent=Intent(this,apple::class.java )
            startActivity(intent)
            Toast.makeText(this@Fruits,"Apple",Toast.LENGTH_LONG).show()
        }
        imageeight=findViewById(R.id.apple)
        imageeight.setOnClickListener{
            val intent=Intent(this,apple::class.java )
            startActivity(intent)
            Toast.makeText(this@Fruits,"Apple",Toast.LENGTH_LONG).show()
        }

    }
}


