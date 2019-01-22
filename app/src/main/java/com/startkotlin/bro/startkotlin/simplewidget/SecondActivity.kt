package com.startkotlin.bro.startkotlin.simplewidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.startkotlin.bro.startkotlin.R
import com.startkotlin.bro.startkotlin.class_object.special.ParcelableClass

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        //接收序列化消息
        val parcelable = intent.extras.getParcelable<ParcelableClass>("message")



    }
}
