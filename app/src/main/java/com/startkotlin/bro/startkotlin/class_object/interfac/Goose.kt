package com.startkotlin.bro.startkotlin.class_object.interfac

import com.startkotlin.bro.startkotlin.utils.Constant
import com.startkotlin.bro.startkotlin.class_object.WildAnimal

/**
 * Created by zhangshan on 2019/1/21 19:17.
 */
class Goose(name: String = "鹅", sex: Int = Constant.MALE) : WildAnimal(name, sex), Behavior {
    override fun fly(): String {
        return "鹅能飞一点点,但飞不高"
    }

    override fun swim(): String {
        return "鹅鹅鹅,曲项向天歌"
    }

    override fun run(): String {
        return super.run()
    }


    override var skilledSports: String = "游泳"
}