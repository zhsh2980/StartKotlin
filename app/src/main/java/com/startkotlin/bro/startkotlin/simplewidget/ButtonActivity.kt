package com.startkotlin.bro.startkotlin.simplewidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.startkotlin.bro.startkotlin.R
import kotlinx.android.synthetic.main.activity_button.*
import org.jetbrains.anko.toast

class ButtonActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        onclick()
    }

    private fun onclick() {

        //第一种点击
//        btn_click_1.setOnClickListener { v ->
//            toast("点击了控件:${(v as Button).text}")
//        }

        //第二种点击
//        btn_click_1.setOnClickListener(MyClickListener())
//        btn_click_2.setOnLongClickListener(MyLongClickListener())

        //第三种点击
        btn_click_1.setOnClickListener(this)
        btn_click_2.setOnLongClickListener(this)
    }

    private inner class MyClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            toast("点击了控件:${(v as Button).text}")
        }

    }

    private inner class MyLongClickListener : View.OnLongClickListener {
        override fun onLongClick(v: View?): Boolean {
            toast("长击了控件:${(v as Button).text}")
            return true
        }

    }

    override fun onClick(v: View?) {
        toast("点击了控件:${(v as Button).text}")
    }

    override fun onLongClick(v: View?): Boolean {
        toast("长击了控件:${(v as Button).text}")
        return true
    }

}
