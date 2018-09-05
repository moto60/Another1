package com.example.markpadua.another1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun toastmessage(activityname: String?){
        Toast.makeText(this,"This is $activityname",Toast.LENGTH_SHORT).show()
    }

}