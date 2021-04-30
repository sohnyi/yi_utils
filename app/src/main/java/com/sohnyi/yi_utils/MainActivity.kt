package com.sohnyi.yi_utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sohnyi.timeuti.apartToday
import com.sohnyi.timeuti.isToady
import java.util.*

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val time: Long = 1619772659442L
        Log.d(TAG, "onCreate: ${time.isToady}");

        val c1 = Calendar.getInstance()
        c1.set(Calendar.YEAR, 2021);
        c1.set(Calendar.MONTH, 4);
        c1.set(Calendar.DAY_OF_MONTH, 1);

        val c2 = Calendar.getInstance();

        Log.d(TAG, "onCreate: ${c1.apartToday}")


    }
}