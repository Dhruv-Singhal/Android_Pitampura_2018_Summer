package com.codingblocks.intents

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG = "MAINACT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpen.setOnClickListener({
            val intent = Intent(this, OtherActivity::class.java)
            val something = etSomething.text.toString()
            intent.putExtra("DATA", something)
            startActivity(intent)
        })
    }
}
