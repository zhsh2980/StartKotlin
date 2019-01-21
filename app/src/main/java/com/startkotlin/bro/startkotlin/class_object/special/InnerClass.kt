package com.startkotlin.bro.startkotlin.class_object.special

/**
 * Created by zhangshan on 2019/1/21 20:58.
 * 嵌套类和内部类
 */
class InnerClass(var treeName: String = "树") {

    //嵌套类 不允许访问外部类的成员
    //类名直接调用
    class Flower(var flowerName: String) {
        fun getName(): String {
            return "这是一朵$flowerName"
        }
    }

    //加了 inner 表示内部类,可以访问外部类的成员
    //类的实例调用
    inner class Fruit(var fruitName: String) {
        fun getName(): String {
            return "这是${treeName}长出来的$fruitName"
        }
    }

}