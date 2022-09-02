package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class hotdrinks : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView
    lateinit var imagethree:ImageView
    lateinit var imagefour:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_hotdrinks)
        imageone = findViewById(R.id.dormans)
        imagetwo = findViewById(R.id.tea)
        imagethree =findViewById(R.id.nescafe)
        imagefour =findViewById(R.id.milo)

        imageone=findViewById(R.id.dormans)
        imageone.setOnClickListener{
            val intent=Intent(this,dormans::class.java )
            startActivity(intent)
            Toast.makeText(this@hotdrinks,"Dormans Coffee",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.tea)
        imagetwo.setOnClickListener{
            val intent=Intent(this,tea::class.java )
            startActivity(intent)
            Toast.makeText(this@hotdrinks,"Kericho Tea",Toast.LENGTH_LONG).show()
        }
        imagethree=findViewById(R.id.nescafe)
        imagethree.setOnClickListener{
            val intent=Intent(this,nescafe::class.java )
            startActivity(intent)
            Toast.makeText(this@hotdrinks,"Nescafe Coffee",Toast.LENGTH_LONG).show()
        }
        imagefour=findViewById(R.id.milo)
        imagefour.setOnClickListener{
            val intent=Intent(this,milo::class.java )
            startActivity(intent)
            Toast.makeText(this@hotdrinks,"Milo",Toast.LENGTH_LONG).show()
        }

    }
}

