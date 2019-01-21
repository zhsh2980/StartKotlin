package com.startkotlin.bro.startkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.startkotlin.bro.startkotlin.utils.DateUtils
import kotlinx.android.synthetic.main.activity_second.*

/**
 * 函数应用
 */
class FunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        onBtnClick()

    }

    //------------------------------1. 基本用法------------------------------

    /**
     * 无返回值(默认返回 Unit 类型,相当于 Java 里的 void 类型)
     * 空方法
     */
    fun getDinnerEmpty() {

    }

    /**
     * 无返回值
     * 传参
     */
    fun getDinnerInput(
        egg: Int,
        leek: Double,
        water: String?
    ) {

    }

    /**
     * 有返回值
     *
     */
    fun getDinnerOutput(): String {
        var dinner: String = "巧妇难为无米之炊,汝速去买菜"
        return dinner
    }

    //------------------------------2. 输入参数变化------------------------------
    //1. 默认参数
    fun getFourBigDefault(
        general: String,
        first: String = "造纸术",
        second: String = "印刷术",
        third: String = "火药",
        fouth: String = "指南针"
    ): String {
        return "$first,$second,$third,$fouth,"
    }

    //1. 可变参数
    fun getFourBigVararg(
        general: String,
        first: String = "造纸术",
        second: String = "印刷术",
        third: String = "火药",
        fouth: String = "指南针",
        vararg otherArray: String?
    ): String {
        var answer = "$first,$second,$third,$fouth,"
        for (item in otherArray) {
            answer = "$answer,$item"
        }
        return answer
    }

    /**
     * 点击事件
     */
    private fun onBtnClick() {
        btn_1.setOnClickListener {
            // 1. 基本用法
            getDinnerEmpty()
            getDinnerInput(10, 10.1, null)
            // 2. 输入参数变化 (参数个数不固定)
            getFourBigDefault("古代四大发明", "蔡伦发明的造纸术")
            //改变非首位参数
            getFourBigDefault("古代四大发明", second = "活字印刷")
            //可变参数
            getFourBigVararg("古代四大发明", "造纸术", "印刷术", "火药", "指南针", "丝绸", "瓷器", "茶叶")
            //泛型参数
            appendString("haha", "hehe", "haha")
            //内联函数  例如 Int Double Float 都属于 Number,设计一个函数可以传入三种类型的数据
            setArrayStr(arrayOf<Int>(1, 2, 3, 4))
            setArrayStr(arrayOf<Float>(1.0f, 2.0f, 3.0f, 4.0f))
            setArrayStr(arrayOf<Double>(11.11, 22.22, 33.33, 44.44))

            //简化函数
            factorialSimple(5)

            //高阶函数
            val arrayOf: Array<String> = arrayOf("haha", "hehe", "I am  ", " Student")
            val maxCustom = maxCustom(arrayOf, { a, b -> a > b })


            //扩展函数
            val array: Array<Double> = arrayOf(1.0, 2.0, 3.0)
            array.swap_T(0, 2)
            //扩展高阶函数
            array.maxCustom_T(array, { a, b -> a > b })

            //单例
            val nowDate = DateUtils.nowDate
            Log.i("单例时间:", nowDate)
        }
    }

    /**
     * 4.3 几种特殊函数
     * 泛型函数  内联函数  简化函数  尾递归函数  高阶函数
     */
    //泛型参数 拼接参数
    fun <T> appendString(
        tag: String,
        vararg otherInfo: T?
    ): String {
        var string: String = "$tag: "
        for (item in otherInfo) {
            string = "$string${item.toString()}"
        }
        return string
    }

    //只有泛型类才有成员泛型函数
    //所以引入内联函数  例如 Int Double Float 都属于 Number,设计一个函数可以传入三种类型的数据
    inline fun <reified T : Number> setArrayStr(array: Array<T>): String {
        var str: String = "数组元素依次排列"
        for (item in str) {
            str = str + item.toString() + ","
        }
        return str
    }

    //简化函数 (函数比较简单的时候,可以用 = 代替 {})
    //正常函数
    fun factorial(n: Int): Int {
        return if (n <= 1) n
        else n * factorial(n - 1)
    }

    //简化函数
    fun factorialSimple(n: Int): Int = if (n <= 1) n else n * factorial(n - 1)

    //高阶函数  参数中传入函数
    fun <T> maxCustom(array: Array<T>, general: (T, T) -> Boolean): T? {
        var max: T? = null
        for (item in array) {
            if (max == null || general(item, max)) {
                max = item
            }
        }
        return max
    }


    /**
     * 4.4 增强系统函数
     * 扩展函数  扩展高阶函数  日期时间函数  单例对象
     */

    //4.4.1 扩展函数  交换数组中的元素
    /**
     * @param pos1 第一个元素位置
     * @param pos2 第二个元素位置
     */
    //普通
    fun Array<Int>.swap(pos1: Int, pos2: Int) {
        val tmp = this[pos1]
        this[pos1] = this[pos2]
        this[pos2] = tmp
    }

    //带泛型
    fun <T> Array<T>.swap_T(pos1: Int, pos2: Int) {
        val tmp = this[pos1]
        this[pos1] = this[pos2]
        this[pos2] = tmp
    }

    //4.4.2 扩展高阶函数  交换数组中的元素
    //就是讲上一节的高阶函数加到系统函数中
    fun <T> Array<T>.maxCustom_T(array: Array<T>, general: (T, T) -> Boolean): T? {
        var max: T? = null
        for (item in array) {
            if (max == null || general(item, max)) {
                max = item
            }
        }
        return max
    }

}
