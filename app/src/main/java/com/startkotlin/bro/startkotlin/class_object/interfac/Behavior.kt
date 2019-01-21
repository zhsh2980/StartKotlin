package com.startkotlin.bro.startkotlin.class_object.interfac

/**
 * Created by zhangshan on 2019/1/21 19:14.
 */
interface Behavior {
    //接口内部方法默认就是抽象的 所以不加 abstract 和 open
    fun fly():String
    fun swim():String
    //接口内部允许实现方法,不过此方法不是抽象方法,不能加 abstract ,不过依然是 open 类型的
    fun run():String{
        return "大多数鸟儿跑的都很快"
    }

    var skilledSports:String
}