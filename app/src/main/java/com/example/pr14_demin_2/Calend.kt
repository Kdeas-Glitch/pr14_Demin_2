package com.example.pr14_demin_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Calend: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
    }

    fun setting(view: View) {
        var intent = Intent(this@Calend,setting::class.java)
        startActivity(intent)
        finish()
    }
    fun task(view: View) {
        var intent = Intent(this@Calend,MainActivity::class.java)
        startActivity(intent)
        finish()
    }


}