package com.startkotlin.bro.startkotlin.simplewidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.startkotlin.bro.startkotlin.FunActivity
import com.startkotlin.bro.startkotlin.R
import com.startkotlin.bro.startkotlin.SimpleDataStructActivity
import com.startkotlin.bro.startkotlin.class_object.ClassAndObjectActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_simple_widget.*
import org.jetbrains.anko.startActivity

class SimpleWidgetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_widget)
        onBtnClick()//点击事件
    }

    private fun onBtnClick() {
        btn_widget_1.setOnClickListener {
            startActivity<ButtonActivity>()
        }
        btn_widget_2.setOnClickListener {
            startActivity<CheckboxActivity>()
        }
        btn_widget_3.setOnClickListener {
            startActivity<DialogActivity>()
        }
        btn_widget_4.setOnClickListener {
            startActivity<ButtonActivity>()
        }

    }
}
