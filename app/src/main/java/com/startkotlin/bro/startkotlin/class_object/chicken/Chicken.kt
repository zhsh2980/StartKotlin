package com.startkotlin.bro.startkotlin.class_object.chicken

/**
 * Created by zhangshan on 2019/1/21 18:10.
 */
abstract class Chicken(name: String, sex: Int, var voice: String) {


    abstract fun callOut(): String

    /**
     * 伴生对象
     * 相当于 Java 里的 静态方法
     */
    companion object  {

        //静态常量不可变,用 val 修饰
        val MALE = 0
        val FEMALE = 1
        val UNKNOWN = -1

        fun judgeSex(sexName: String): Int {
            var sex: Int = when (sexName) {
                "公", "雄" -> MALE
                "母", "雌" -> FEMALE
                else -> UNKNOWN
            }
            return sex
        }
    }

}