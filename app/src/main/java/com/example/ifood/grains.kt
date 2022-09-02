package com.example.ifood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast


class grains : AppCompatActivity() {
    lateinit var imageone:ImageView
    lateinit var imagetwo:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_grains)
        imageone = findViewById(R.id.maize)
        imagetwo = findViewById(R.id.peas)

        imageone=findViewById(R.id.maize)
        imageone.setOnClickListener{
            val intent=Intent(this,maize::class.java )
            startActivity(intent)
            Toast.makeText(this@grains,"Maize",Toast.LENGTH_LONG).show()
        }
        imagetwo=findViewById(R.id.peas)
        imagetwo.setOnClickListener{
            val intent=Intent(this,peas::class.java )
            startActivity(intent)
            Toast.makeText(this@grains,"Peas",Toast.LENGTH_LONG).show()
        }



    }
}


