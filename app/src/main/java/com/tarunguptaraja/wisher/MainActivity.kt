package com.tarunguptaraja.wisher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthDayCard(view: View) {

        val editText = findViewById<EditText>(R.id.editText)
        val name = editText.editableText.toString()
        val intent = Intent(this, birthdayGreeting::class.java)
        intent.putExtra(birthdayGreeting.NAME_EXTRA,name)
        startActivity(intent)
    }

}