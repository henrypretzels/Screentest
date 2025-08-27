package com.example.screentest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "SecondActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i(TAG, "onCreate() chamado")

        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener {
            // Volta para a tela anterior
            finish()
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
