package com.startkotlin.bro.startkotlin.class_object.interfac

/**
 * Created by zhangshan on 2019/1/21 19:17.
 * 代理类
 */
class BehaviorFly : Behavior {
    override fun fly(): String {
        return "翱翔天空"
    }

    override fun swim(): String {
        return "落水凤凰不如鸡"
    }

    override fun run(): String {
        return "能飞干嘛要走"
    }


    override var skilledSports: String = "飞翔"
}