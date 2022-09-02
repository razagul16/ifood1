package com.example.ifood

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


class modeofpayment : AppCompatActivity() {
    lateinit var Mpesa: ImageView
    lateinit var Phone: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modeofpayment)

        supportActionBar?.hide()

        Mpesa = findViewById(R.id.payhere)
        Phone = findViewById(R.id.phone)
//set to access MPESa
        Mpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it)

            }
        }
        //set for calls
        Phone.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0700175002"))
            if (ContextCompat.checkSelfPermission(
                    this@modeofpayment,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@modeofpayment,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)



            }
        }


    }
}

