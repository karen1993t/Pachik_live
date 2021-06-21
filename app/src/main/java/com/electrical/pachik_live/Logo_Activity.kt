package com.electrical.pachik_live

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Logo_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)
    }

    override fun onResume() {
        super.onResume()
        val intentStart = Intent(this, MainActivity::class.java)
        GlobalScope.launch(Dispatchers.Default) {
            delay(700)
            startActivity(intentStart)
        }
    }

    override fun onStop() {
        super.onStop()
        finish()
    }
}