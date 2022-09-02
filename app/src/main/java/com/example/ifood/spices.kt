package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class spices : AppCompatActivity() {
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
        setContentView(R.layout.activity_spices)
        imageone = findViewById(R.id.bpepper)
        imagetwo = findViewById(R.id.cayenne)
        imagethree =findViewById(R.id.chilli)
        imagefour =findViewById(R.id.garlic)
        imagefive =findViewById(R.id.paprika)
        imagesix = findViewById(R.id.paprika)
        imageseven = findViewById(R.id.paprika)
        imageeight = findViewById(R.id.paprika)

        imageone=findViewById(R.id.bpepper)
        imageone.setOnClickListener{
            val intent=Intent(this,bpepper::class.java )
            startActivity(intent)
            Toast.makeText(this@spices,"Black Pepper",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.cayenne)
        imagetwo.setOnClickListener{
            val intent=Intent(this,cayenne::class.java )
            startActivity(intent)
            Toast.makeText(this@spices,"Cayenne",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.chilli)
        imagethree.setOnClickListener{
            val intent=Intent(this,chilli::class.java )
            startActivity(intent)
            Toast.makeText(this@spices,"Chilli",Toast.LENGTH_LONG).show()
        }
        imagefour=findViewById(R.id.garlic)
        imagefour.setOnClickListener{
            val intent=Intent(this,garlic::class.java )
            startActivity(intent)
            Toast.makeText(this@spices,"Garlic",Toast.LENGTH_LONG).show()
        }
        imagefive=findViewById(R.id.paprika)
        imagefive.setOnClickListener{
            val intent=Intent(this,paprika::class.java )
            startActivity(intent)
            Toast.makeText(this@spices,"Paprika",Toast.LENGTH_LONG).show()
        }
        imagesix=findViewById(R.id.paprika)
        imagesix.setOnClickListener{
            val intent=Intent(this,paprika::class.java )
            startActivity(intent)
            Toast.makeText(this@spices,"paprika",Toast.LENGTH_LONG).show()
        }
        imageseven=findViewById(R.id.paprika)
        imageseven.setOnClickListener{
            val intent=Intent(this,paprika::class.java )
            startActivity(intent)
            Toast.makeText(this@spices,"paprika",Toast.LENGTH_LONG).show()
        }
        imageeight=findViewById(R.id.paprika)
        imageeight.setOnClickListener{
            val intent=Intent(this,paprika::class.java )
            startActivity(intent)
            Toast.makeText(this@spices,"paprika",Toast.LENGTH_LONG).show()
        }

    }
}


