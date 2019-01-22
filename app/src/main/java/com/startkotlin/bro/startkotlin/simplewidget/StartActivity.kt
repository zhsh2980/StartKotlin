package com.startkotlin.bro.startkotlin.simplewidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.startkotlin.bro.startkotlin.R
import com.startkotlin.bro.startkotlin.class_object.special.ParcelableClass
import org.jetbrains.anko.startActivity

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        startActivi()
    }

    private fun startActivi() {

        val request = ParcelableClass("小明", "男")
        startActivity<SecondActivity>("message" to request)

    }
}
