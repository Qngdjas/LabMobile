package com.example.lab1mobile

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

public class CreatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_setter)

        val buttonCancel: Button = findViewById(R.id.button3)
        buttonCancel.setOnClickListener {
            val creatorActivity = Intent(this, MainActivity::class.java)
            startActivity(creatorActivity)
        }
    }
}