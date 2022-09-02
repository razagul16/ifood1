package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
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
        setContentView(R.layout.activity_main)
        imageone = findViewById(R.id.fruits)
        imagetwo = findViewById(R.id.hotdrinks)
        imagethree =findViewById(R.id.softdrinks)
        imagefour =findViewById(R.id.dairy)
        imagefive =findViewById(R.id.spices)
        imagesix = findViewById(R.id.meat)
        imageseven = findViewById(R.id.liquor)
        imageeight = findViewById(R.id.grains)

        imageone=findViewById(R.id.fruits)
        imageone.setOnClickListener{
            val intent=Intent(this,Fruits::class.java )
            startActivity(intent)
            Toast.makeText(this@MainActivity,"Fruits",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.hotdrinks)
        imagetwo.setOnClickListener{
            val intent=Intent(this,hotdrinks::class.java )
            startActivity(intent)
            Toast.makeText(this@MainActivity,"Hot Drinks ",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.softdrinks)
        imagethree.setOnClickListener{
            val intent=Intent(this,softdrinks::class.java )
            startActivity(intent)
            Toast.makeText(this@MainActivity,"Soft Drinks",Toast.LENGTH_LONG).show()
        }
        imagefour=findViewById(R.id.dairy)
        imagefour.setOnClickListener{
            val intent=Intent(this,dairyproducts::class.java )
            startActivity(intent)
            Toast.makeText(this@MainActivity,"Dairy Product",Toast.LENGTH_LONG).show()
        }
        imagefive=findViewById(R.id.spices)
        imagefive.setOnClickListener{
            val intent=Intent(this,spices::class.java )
            startActivity(intent)
            Toast.makeText(this@MainActivity,"Spices",Toast.LENGTH_LONG).show()
        }
        imagesix=findViewById(R.id.meat)
        imagesix.setOnClickListener{
            val intent=Intent(this,meat::class.java )
            startActivity(intent)
            Toast.makeText(this@MainActivity,"Meat",Toast.LENGTH_LONG).show()
        }
        imageseven=findViewById(R.id.liquor)
        imageseven.setOnClickListener{
            val intent=Intent(this,alcoholicdrinks::class.java )
            startActivity(intent)
            Toast.makeText(this@MainActivity,"Alcoholic Drinks",Toast.LENGTH_LONG).show()
        }
        imageeight=findViewById(R.id.grains)
        imageeight.setOnClickListener{
            val intent=Intent(this,grains::class.java )
            startActivity(intent)
            Toast.makeText(this@MainActivity,"Grains",Toast.LENGTH_LONG).show()
        }

    }
}

