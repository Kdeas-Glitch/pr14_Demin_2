package com.example.pr14_demin_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_task_activ)
    }

    fun Setting(view: View) {
        var intent = Intent(this@MainActivity,setting::class.java)
        startActivity(intent)
        finish()
    }
    fun login(view: View) {
        var intent = Intent(this@MainActivity,userlogin::class.java)
        startActivity(intent)
        finish()
    }
}