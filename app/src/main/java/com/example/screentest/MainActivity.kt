package com.example.screentest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate() chamado")

        val buttonToSecond = findViewById<Button>(R.id.buttonToSecond)
        buttonToSecond.setOnClickListener {
            // Inicia a SecondActivity
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() chamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart() chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() chamado")
    }
}