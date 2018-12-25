package com.startkotlin.bro.startkotlin

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    //var 可变
    var i: Int = 0
    //不可变
    val j: Int = 1


    //数组
    var int_array: IntArray = intArrayOf(1, 2, 3)
    var int2_array: Array<Int> = arrayOf(4, 5, 6)
    var float_array: Array<Float> = arrayOf(4f, 5f, 6f)
    //stirng数组
    var string_array: Array<String> = arrayOf("hello", "hi", "haha")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //转成 string
        val toString = i.toString()
        //string 转成其他类型
        var str: String = "123.12"
        val toInt = str.toFloat()
        //split 结果是 list
        val split: List<String> = str.split(".")
        //可以通过下标访问 string 指定位置的字符
        val strSub: String = str.get(1).toString()

        toast(strSub)

        var strOrim: String = "hahahahha"

        //字符串拼接(单一元素)
        var strAdd = "拼接字符串$strOrim"

        //字符串拼接(多元素)  需要用{}括起来
        var strAddComplicated: String = "拼接复杂${strOrim.length}"

        // 单个 $ 转义  \$
        var _dollarConvert: String = "拼接\$${strOrim}"
        // 多个 $ 转义  ${"$$$$"}
        var dollarsConvert: String = "拼接${"$$$"}$strOrim"


        // ---------------集合----------------

        //1.Set
        // 不可变 Set  可变 MutableSet
        //特点: 1. 不按顺序  2. 元素唯一性
        //遍历操作
        val goodsMuSet: Set<String> = setOf("iPhone 8", "Mate 10", "Mi 8")
        //1. for-in
        var desc = ""
        for (item in goodsMuSet) {
            desc = "${desc}名称:${item}\n"
        }

        //2. 迭代器
        val iterator = goodsMuSet.iterator()
        var desc2 = ""
        if (iterator.hasNext()) {
            desc2 = "${desc2}名称:${iterator.next()}\n"
        }

        //3. forEach 遍历  kotlin 独有的形式, 用 it 代表每个元素
        var desc3 = ""
        goodsMuSet.forEach { desc3 = "{${desc3}名称:${it}}\n" }


        //2.List
        // 不可变 List  可变 MutableList
        //特点: 1. 按顺序  2. 每次添加到结尾  3. 可修改   4. 可删除指定位置
        //遍历操作  比 Set 多了个按角标遍历
        var descList = ""
        val goodMutList: List<String> = listOf("iPhone 8", "Mate 10", "Mi 8")
        for (i in goodMutList.indices) {
            descList = "${descList}名称:${goodMutList[i]}\n"
        }

        //排序 sort  改变了原集合
        //sortBy 升序  sortByDescending 降序   后面接条件
        goodMutList.sortedBy { it.length }
        goodMutList.sortedByDescending { it.length }

        //3.Map
        // 不可变 Map  可变 MutableMap

        // 初始化  两种
        var goodMap:Map<String , String> = mapOf("苹果" to "iPhone","小米" to "Mi")
        var goodMutMap:MutableMap<String , String> = mutableMapOf(Pair("苹果","iPhone"),Pair("小米","M"))

        // 3 种遍历
        // 1. for
        var descMutMap =""
        for (item in goodMutMap){
            descMutMap = "${descMutMap}厂家:${item.key},名称:${item.value}\n"
        }

        //2. 迭代器
        val iteratorMutMap = goodMutMap.iterator()
        if (iteratorMutMap.hasNext()){
            val next = iteratorMutMap.next()
            descMutMap = "${descMutMap}厂家:${next.key},名称:${next.value}\n"
        }

        //3. forEach (api > 24)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            goodMutMap.forEach { key, value -> descMutMap =  "${descMutMap}厂家:${key},名称:${value}\n"}
        }

        btn_1.setOnClickListener {
            tv_content.text = "点击了"
            toast("你点我了" + i)
        }
        btn_1.setOnLongClickListener {
            tv_content.text = "长按了"
            longToast("你长按了" + i);true
        }


        val size = int_array.size;
        val get = int_array.get(2);


    }
}
