package com.example.lab1mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val alarms = ArrayList<Alarm>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCreator: Button = findViewById(R.id.button)
        buttonCreator.setOnClickListener {
            val creatorActivity = Intent(this, CreatorActivity::class.java)
            startActivity(creatorActivity)
        }

        val buttonJournal: Button = findViewById(R.id.button4)
        buttonJournal.setOnClickListener {
            val journalActivity = Intent(this, JournalActivity::class.java)
            startActivity(journalActivity)
        }
    }
}