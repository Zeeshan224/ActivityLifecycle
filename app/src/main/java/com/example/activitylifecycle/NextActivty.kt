package com.example.activitylifecycle

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NextActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_activty)
        val goBack = findViewById<Button>(R.id.goBack)
        goBack.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Next Activity onCreate: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Next Activity onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Next Activity onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Next Activity onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Next Activity onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Next Activity onDestroy: ")
    }
}

