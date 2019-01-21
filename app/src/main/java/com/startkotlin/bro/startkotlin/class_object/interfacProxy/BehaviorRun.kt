package com.startkotlin.bro.startkotlin.class_object.interfac

/**
 * Created by zhangshan on 2019/1/21 19:17.
 * 代理类
 */
class BehaviorRun : Behavior {
    override fun fly(): String {
        return "飞不起来"
    }

    override fun swim(): String {
        return "望洋兴叹"
    }

    override fun run(): String {
        return super.run()
    }


    override var skilledSports: String = "奔跑"
}