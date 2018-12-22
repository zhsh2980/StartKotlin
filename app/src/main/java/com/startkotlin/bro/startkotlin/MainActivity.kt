package com.startkotlin.bro.startkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    //var 可变
    var i:Int = 0
    //不可变
    val j:Int = 1
    //数组
    var int_array:IntArray = intArrayOf(1,2,3)
    var int2_array:Array<Int> = arrayOf(4,5,6)
    var float_array:Array<Float> = arrayOf(4f,5f,6f)
    //stirng数组
    var string_array:Array<String> = arrayOf("hello" , "hi" , "haha")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_1.setOnClickListener {
            tv_content.text = "点击了"
            toast("你点我了"+i)
        }
        btn_1.setOnLongClickListener {
            tv_content.text = "长按了"
            longToast("你长按了"+i);true
        }


        val size = int_array.size;
        val get = int_array.get(2);


    }
}
