package com.startkotlin.bro.startkotlin.class_object.interfac

/**
 * Created by zhangshan on 2019/1/21 19:17.
 * 代理类
 */
class BehaviorSwim : Behavior {
    override fun fly(): String {
        return "看情况,大雁能飞,企鹅不能"
    }

    override fun swim(): String {
        return "戏水"
    }

    override fun run(): String {
        return "赶鸭子上树"
    }


    override var skilledSports: String = "游泳"
}