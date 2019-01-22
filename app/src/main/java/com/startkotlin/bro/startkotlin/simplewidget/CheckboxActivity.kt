package com.startkotlin.bro.startkotlin.simplewidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.blankj.utilcode.util.LogUtils
import com.startkotlin.bro.startkotlin.R
import kotlinx.android.synthetic.main.activity_checkbox.*
import org.jetbrains.anko.px2dip
import org.jetbrains.anko.sp

class CheckboxActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)
        initView()
    }

    private fun initView() {
        checkbox.isChecked = false
        checkbox.setOnCheckedChangeListener { buttonView, isChecked ->
            tv_checkbox.text = "您${if (isChecked) "勾选了" else "取消勾选了"}复选框"
        }
    }
}
