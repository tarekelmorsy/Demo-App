package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RankActivity : AppCompatActivity() {
    lateinit var title: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rank)
        title = findViewById(R.id.title)

        val extras = intent.extras
        if (extras != null) {
            //show Service Name
            val value = extras.getString("ServiceName")
            title.setText(value)
        }
    }
}