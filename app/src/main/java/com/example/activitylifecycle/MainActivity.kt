package com.example.activitylifecycle

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val intent = Intent(this, NextActivty::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Main Activity onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Main Activity onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Main Activity onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Main Activity onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Main Activity onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Main Activity onDestroy: ")
    }

}
