package com.example.markpadua.another1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_1.*

class Activity2 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        btnToast.setOnClickListener{
            toastmessage("Activity 2")
        }

        btnNext.setOnClickListener{
            val nintent = Intent(this,Activity3::class.java)
            startActivity(nintent)
        }


        btnPrev.setOnClickListener{
            val pintent = Intent(this,Activity1::class.java)
            startActivity(pintent)
        }

    }
}
