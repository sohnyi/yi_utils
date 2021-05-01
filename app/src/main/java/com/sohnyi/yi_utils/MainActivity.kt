package com.sohnyi.yi_utils

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sohnyi.timeuti.toDateString
import java.util.*

class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.text_view).text = "${getString(R.string.hi)} ${Date().toDateString("yyyy-MM-dd")}"
    }
}