package com.qdot.randomidgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.qdot.randomid.RandomID

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,RandomID.getAlphanumericID(12),Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.textRandom).text = RandomID.getAlphanumericID(12)
    }
}