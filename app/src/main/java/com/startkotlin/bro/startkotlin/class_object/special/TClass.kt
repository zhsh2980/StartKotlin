package com.startkotlin.bro.startkotlin.class_object.special

/**
 * Created by zhangshan on 2019/1/22 15:13.
 * 模板类
 * 在类名后面添加一个<T>,表示一个模板类
 */
class TClass<T>(var name: String, var length: T) {

    fun getInfo(): String {
        var unit: String = when (length) {
            is String -> "米"
            is Number -> "m"
            else -> ""
        }
        return "${name}的长度是${length}${unit}"
    }

}