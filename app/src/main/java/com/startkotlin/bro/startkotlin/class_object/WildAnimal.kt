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
class WildAnimal @JvmOverloads constructor(var name: String, val sex: Int = 0) {
    //类名后面的括号是主构造函数的参数
    //init 后面的是主构造函数的内部代码

    //非空的成员属性必须在声明时赋值或者在构造函数中赋值,否则会报错
    var sexName: String

    init {
        println("Animal_2:构造函数   $name")
        sexName = if (sex == 0) "公" else "母"
    }
}