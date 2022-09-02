package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class dairyproducts : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_dairyproducts)
        imageone = findViewById(R.id.slicedcheese)
        imagetwo = findViewById(R.id.mozzarella)
        imagethree =findViewById(R.id.yogurt)


        imageone=findViewById(R.id.slicedcheese)
        imageone.setOnClickListener{
            val intent=Intent(this,slicedcheese::class.java )
            startActivity(intent)
            Toast.makeText(this@dairyproducts,"Sliced Cheese",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.mozzarella)
        imagetwo.setOnClickListener{
            val intent=Intent(this,mozzarella::class.java )
            startActivity(intent)
            Toast.makeText(this@dairyproducts,"Mozzarella",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.yogurt)
        imagethree.setOnClickListener{
            val intent=Intent(this,yoghurt::class.java )
            startActivity(intent)
            Toast.makeText(this@dairyproducts,"Yoghurt",Toast.LENGTH_LONG).show()
        }


    }
}


