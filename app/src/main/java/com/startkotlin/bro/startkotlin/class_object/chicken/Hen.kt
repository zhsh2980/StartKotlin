package com.startkotlin.bro.startkotlin.class_object.chicken

import com.startkotlin.bro.startkotlin.class_object.animal.WildAnimal

/**
 * Created by zhangshan on 2019/1/21 18:11.
 */
class Hen(var name: String = "母鸡", var sex:Int = Chicken.FEMALE, voice: String = "喔喔喔") : Chicken(name, sex, voice) {

    override fun callOut(): String {
        return "$name 叫了"
    }


}