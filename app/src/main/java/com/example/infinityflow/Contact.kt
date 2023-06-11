package com.example.infinityflow

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Contact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val btnHome = findViewById<Button>(R.id.btnHome)
        val btnAbout = findViewById<Button>(R.id.btnAbout)
        val btnSettings = findViewById<Button>(R.id.btnSettings)
        val btnContact = findViewById<Button>(R.id.btnContact)

        val btnNav = findViewById<ImageView>(R.id.btn_nav)
        val boxLayout = findViewById<LinearLayout>(R.id.box_layout)

        btnNav.setOnClickListener {
            if (boxLayout.visibility == View.VISIBLE) {
                boxLayout.visibility = View.GONE
            } else {
                boxLayout.visibility = View.VISIBLE
            }
        }

        btnHome.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        btnAbout.setOnClickListener{
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }

        btnSettings.setOnClickListener{
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        btnContact.setOnClickListener{
            val intent = Intent(this, Contact::class.java)
            startActivity(intent)
        }


    }

}