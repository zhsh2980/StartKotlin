package com.startkotlin.bro.startkotlin.class_object

import android.content.Context
import org.jetbrains.anko.toast

/**
 * Created by zhangshan on 2019/1/21 14:21.
 *
 * 此类包含一个主函数
 * 主函数第三个参数采用默认参数
 * @JvmOverloads constructor 是为了让 java兼容这种写法
 *
 */
class Animal_Fine @JvmOverloads constructor(context: Context, name: String, sex: Int = 0) {
    //类名后面的括号是主构造函数的参数
    //init 后面的是主构造函数的内部代码
    init {
        println("Animal_2:构造函数   $name")
        var sexName: String = if (sex == 0) "公" else "母"
        context.toast("这只${name}是${sexName}的")
    }

//    constructor(context: Context, name: String, sex: Int) : this(context, name) {
//        var sexName: String = if (sex == 0) "公" else "母"
//        context.toast("这只${name}是${sexName}的")
//    }
}