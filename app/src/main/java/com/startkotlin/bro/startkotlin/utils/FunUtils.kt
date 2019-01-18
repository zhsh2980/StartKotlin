package com.startkotlin.bro.startkotlin.utils

/**
 * Created by zhangshan on 2019/1/9 18:12.
 */
class FunUtils {

    //拼接参数
    fun <T> appendString(tag: String, vararg otherInfo: T?) :String{
        var string: String = "$tag: "
        for (item in otherInfo) {
            string = "$string${item.toString()}"
        }
        return string
    }

}