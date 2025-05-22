package com.example.pr14_demin_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settingsactivity)
    }

    fun reg(view: View) {
        var intent = Intent(this@setting,Calend::class.java)
        startActivity(intent)
        finish()
    }
}