package com.startkotlin.bro.startkotlin.class_object

/**
 * Created by zhangshan on 2019/1/21 17:42.
 */
class Bear(name: String = "熊", sex: Int = WildAnimal.MALE) : WildAnimal(name, sex) {

    /**
     * 重写方法
     */
    override fun getSexName(sex: Int): String {
        return if (sex == MALE) "熊" else "雌"
    }

}