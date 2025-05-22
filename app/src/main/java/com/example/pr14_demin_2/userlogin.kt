package com.example.pr14_demin_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class userlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userlogin)
    }
    fun Reg(view: View) {
        var intent = Intent(this@userlogin,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}