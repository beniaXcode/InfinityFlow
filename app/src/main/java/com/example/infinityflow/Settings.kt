package com.example.infinityflow

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Settings : AppCompatActivity() {

    private lateinit var notificationSwitch: Switch
    private lateinit var languageSpinner: Spinner
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Settings"

        notificationSwitch = findViewById(R.id.notificationSwitch)
        languageSpinner = findViewById(R.id.languageSpinner)
        saveButton = findViewById(R.id.saveButton)

        saveButton.setOnClickListener {
            saveSettings()
        }


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

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun saveSettings() {
        val enableNotifications = notificationSwitch.isChecked
        val selectedLanguage = languageSpinner.selectedItem.toString()

        // Perform the saving of settings here

        Toast.makeText(this, "Settings saved", Toast.LENGTH_SHORT).show()
    }

}