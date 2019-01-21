package com.startkotlin.bro.startkotlin.class_object

import android.content.Context
import org.jetbrains.anko.toast

/**
 * Created by zhangshan on 2019/1/21 14:21.
 *
 * 此类包含一个主函数和一个二级函数
 * 缺点:调用二级函数会先调用主函数
 */
class Animal_2(context: Context, name: String) {
    //类名后面的括号是主构造函数的参数
    //init 后面的是主构造函数的内部代码
    init {
        println("Animal_2:构造函数   $name")
        context.toast("这是只${name}")
    }

    constructor(context: Context, name: String, sex: Int) : this(context, name) {
        var sexName: String = if (sex == 0) "公" else "母"
        context.toast("这只${name}是${sexName}的")
    }
}