package com.yabahddou.dismissdialogs

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDialogs(view: android.view.View) {
        Dialog1().show(supportFragmentManager, "dialog1")
        Handler(Looper.getMainLooper()).postDelayed(5_000) {
            Dialog2().show(supportFragmentManager, "dialog2")
        }
    }
}