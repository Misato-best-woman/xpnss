package com.akagi.xpnss

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class OutcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outcome)

        val actionBar: android.app.ActionBar? = actionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#CC0000")))
    }
}