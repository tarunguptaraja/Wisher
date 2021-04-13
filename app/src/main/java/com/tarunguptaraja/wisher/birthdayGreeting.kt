package com.tarunguptaraja.wisher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class birthdayGreeting : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        val wish = findViewById<TextView>(R.id.wish)
        wish.text="Happy Birthday\n $name"

    }
}