package com.startkotlin.bro.startkotlin

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onBtnClick()//点击事件
        dataStruct()//数据结构
        controlCodes()//控制语句

    }

    /**
     * 点击事件
     */
    private fun onBtnClick() {
        var str: String = "我是不一样的烟火"
        btn_1.setOnClickListener {
            tv_content.text = "点击了"
            toast("你点我了${str}")
        }
        btn_1.setOnLongClickListener {
            tv_content.text = "长按了"
            longToast("你长按了${str}");true
        }
    }

    /**
     * 控制语句
     */
    private fun controlCodes() {

        //--------------------------if  else-------------------------
        var booValue = true
        var strIf = "simple if else"
        strIf = if (booValue) "赋值1" else "赋值2"

        //--------------------------when/else------------------------
        var count: Int = 0
        var dynamicInt: Int = 10
        val countEnd = when (count) {
            0, 2, 4, 6 -> "赋值1"
            1, 3, 5, 7 -> "赋值2"
            dynamicInt -> "动态值"
            in 13..19 -> "连续值"
            !in 20..30 -> "连续值的区间外"
            else -> "默认值"
        }

        //--------------------------is------------------------
        //java 里的 instanceof 变成 is
        var countType: Number
        var countOrin = 0
        countType = when (countOrin) {
            0 -> count.toLong()
            1 -> count.toShort()
            else -> count.toInt()
        }
        when (countType) {
            is Long -> "long 类型"
            is Short -> "short 类型"
            else -> "其他类型"

        }
        val oneLong:Long = 1L
        val result = oneLong is Long
        val reverseResult = oneLong !is Long

        //--------------------------in------------------------
        //数组中是否包含某元素
        val oneArray:IntArray = intArrayOf(1,2,3,4,5)
        val four:Int = 4
        val five:Int = 4
        val result_2 = four in oneArray
        val result_3 = five !in oneArray

        //跳出多重循环  @关键字
        var i: Int = 0
        val goodMutList: List<String> = listOf("iPhone 8", "Mate 10", "Mi 8")
        outside@ while (i < goodMutList.size) {
            var j: Int = 10
            var item = goodMutList[i]
            while (j < item.length) {
                if (item[j] == '3') {
                    break@outside
                }
                j++
            }
            i++
        }

        //不可为空 可调用 6 种判空方法
        var strNotNull: String = ""

        //可为空  只能调用下面两种
        var strCanNull: String? = ""
        strCanNull.isNullOrBlank()
        strCanNull.isNullOrEmpty()


        //对于可为空的,获取length 时仍需判空
        var length = 0
        length = if (strCanNull != null) strCanNull.length else -1

        strCanNull?.length//(如果变量为空,结果也为空)
        val i1 = strCanNull?.length
        //?: 如果左面为空,返回右侧表达式
        val i2 = strCanNull?.length ?: -1

        //可为空的变量如果用 .length 编辑器会报错,如果确保此变量不为空,可在前面加!!强制变为不为空(如果此时为空,会报异常风险)
        val length1 = strCanNull!!.length

        //3.4 等式判断
        //1. String 值比较
        var str1: String = "哈哈"
        var str2: String = "哈哈"
        val b: Boolean = str1 == str2
        toast("比较结果是:$b")

        // === 比较引用



    }

    /**
     * 数据结构
     */
    fun dataStruct() {

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

        val size = int_array.size;
        val get = int_array.get(2);

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
        var goodMap: Map<String, String> = mapOf("苹果" to "iPhone", "小米" to "Mi")
        var goodMutMap: MutableMap<String, String> = mutableMapOf(Pair("苹果", "iPhone"), Pair("小米", "M"))

        // 3 种遍历
        // 1. for
        var descMutMap = ""
        for (item in goodMutMap) {
            descMutMap = "${descMutMap}厂家:${item.key},名称:${item.value}\n"
        }

        //2. 迭代器
        val iteratorMutMap = goodMutMap.iterator()
        if (iteratorMutMap.hasNext()) {
            val next = iteratorMutMap.next()
            descMutMap = "${descMutMap}厂家:${next.key},名称:${next.value}\n"
        }

        //3. forEach (api > 24)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            goodMutMap.forEach { key, value -> descMutMap = "${descMutMap}厂家:${key},名称:${value}\n" }
        }

    }
}
