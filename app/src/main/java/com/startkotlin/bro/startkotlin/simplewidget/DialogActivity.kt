package com.startkotlin.bro.startkotlin.simplewidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.startkotlin.bro.startkotlin.R
import kotlinx.android.synthetic.main.activity_dialog.*
import org.jetbrains.anko.alert

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
        btn_dialog.setOnClickListener {
            alert("我是内容", "我是标题") {
                positiveButton("确定") { it ->
                    it.dismiss()
                }
                negativeButton("我再想想") { it ->
                    it.dismiss()
                }
            }.show()
        }
    }
}
