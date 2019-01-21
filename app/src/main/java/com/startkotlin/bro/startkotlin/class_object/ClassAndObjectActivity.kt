package com.startkotlin.bro.startkotlin.class_object

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.blankj.utilcode.util.LogUtils
import com.startkotlin.bro.startkotlin.R
import com.startkotlin.bro.startkotlin.class_object.interfac.BehaviorFly
import com.startkotlin.bro.startkotlin.class_object.interfacProxy.WildFowl
import com.startkotlin.bro.startkotlin.class_object.special.InnerClass
import com.startkotlin.bro.startkotlin.utils.Constant

/**
 * 第五章
 * 类和对象
 */
class ClassAndObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_and_object)
//        var animal: Animal_Fine = Animal_Fine(this, "鸡")

//        var animal: WildAnimal = WildAnimal("鸡")
//        toast("这只${animal.name}是${animal.sexName}的")
//        val judgeSex = WildAnimal.WildAnimalCompanion.judgeSex("雄");

//        val bear = Bear(sex = WildAnimal.FEMALE)
//        toast(bear.getDesc("鸟语林"))

//        val callOut = Cock().callOut()
//        toast(callOut)

//        val fly = BehaviorFly().fly()
//        toast(fly)

        //代理接口
//        val wildFowl = WildFowl("老鹰", Constant.MALE, BehaviorFly())
//        LogUtils.i(wildFowl.name + wildFowl.fly())

        //内部类
        val name = InnerClass.Flower("桃花").getName()
        LogUtils.i(name)

        LogUtils.i(InnerClass("桃树").Fruit("桃子").getName())
    }
}
