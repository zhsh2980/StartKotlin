package com.startkotlin.bro.startkotlin

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.startkotlin.bro.startkotlin.class_object.ClassAndObjectActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onBtnClick()//点击事件
    }

    private fun onBtnClick() {
        btn_chapter_1.setOnClickListener{
            startActivity<SimpleDataStructActivity>()
        }
        btn_chapter_2.setOnClickListener{
            startActivity<FunActivity>()
        }
        btn_chapter_3.setOnClickListener{
            startActivity<ClassAndObjectActivity>()
        }

    }


}
