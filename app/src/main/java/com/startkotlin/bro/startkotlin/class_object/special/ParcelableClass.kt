package com.startkotlin.bro.startkotlin.class_object.special

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by zhangshan on 2019/1/22 13:57.
 * 序列化数据
 */
@Parcelize
data class ParcelableClass(
    var name: String,
    var sex: String
) :
    Parcelable {

}