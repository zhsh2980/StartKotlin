package com.startkotlin.bro.startkotlin.class_object.animal

/**
 * Created by zhangshan on 2019/1/21 14:21.
 *
 * 此类包含一个主函数
 * 主函数第三个参数采用默认参数
 * @JvmOverloads constructor 是为了让 java兼容这种写法
 *
 */
open class WildAnimal @JvmOverloads constructor(var name: String, val sex: Int = 0) {
    //类名后面的括号是主构造函数的参数
    //init 后面的是主构造函数的内部代码

    //非空的成员属性必须在声明时赋值或者在构造函数中赋值,否则会报错
    var sexName: String

    init {
//        println("Animal_2:构造函数   $name")
        sexName = getSexName(sex)
    }

    open protected fun getSexName(sex: Int): String {
        return if (sex == MALE) "公" else "母"
    }

    fun getDesc(tag: String): String {
        return "欢迎来到$tag:这只${name}是${sexName}的"
    }


    /**
     * 伴生对象
     * 相当于 Java 里的 静态方法
     */
    companion object WildAnimalCompanion {

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