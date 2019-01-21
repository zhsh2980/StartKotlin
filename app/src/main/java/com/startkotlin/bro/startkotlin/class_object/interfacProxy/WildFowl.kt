package com.startkotlin.bro.startkotlin.class_object.interfacProxy

import com.startkotlin.bro.startkotlin.utils.Constant
import com.startkotlin.bro.startkotlin.class_object.WildAnimal
import com.startkotlin.bro.startkotlin.class_object.interfac.Behavior

/**
 * Created by zhangshan on 2019/1/21 20:42.
 * 此类引用了代理类
 */
class WildFowl(name: String, sex: Int = Constant.MALE, behavior: Behavior) : WildAnimal(name, sex),
    Behavior by behavior {
}