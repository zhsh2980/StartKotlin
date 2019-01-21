package com.startkotlin.bro.startkotlin.class_object

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.startkotlin.bro.startkotlin.R
import com.startkotlin.bro.startkotlin.class_object.animal.Bear
import com.startkotlin.bro.startkotlin.class_object.animal.WildAnimal
import com.startkotlin.bro.startkotlin.class_object.chicken.Cock
import com.startkotlin.bro.startkotlin.class_object.interfac.Goose
import org.jetbrains.anko.toast

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

        val fly = Goose().fly()
        toast(fly)
    }
}
