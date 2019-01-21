package com.startkotlin.bro.startkotlin.class_object.animal

import android.content.Context
import org.jetbrains.anko.toast

/**
 * Created by zhangshan on 2019/1/21 14:21.
 * 此类包含两个二级函数,分开调用,无关联
 */
class Animal_1 {

    constructor(context: Context, name: String) {
        context.toast("这是只${name}")
    }

    constructor(context: Context, name: String, sex: Int)  {
        var sexName: String = if (sex == 0) "公" else "母"
        context.toast("这只${name}是${sexName}的")
    }
}