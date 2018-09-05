package com.example.markpadua.another1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_1.*

class   Activity3 :BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        btnToast?.setOnClickListener{
            toastmessage("Activity 3")
        }

        btnNext?.setOnClickListener{
            val nintent = Intent(this,Activity1::class.java)
            startActivity(nintent)
        }


        btnPrev?.setOnClickListener{
            val pintent = Intent(this,Activity2::class.java)
            startActivity(pintent)
        }

    }
}
