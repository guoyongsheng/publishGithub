package com.teacher.mylibrary

/**
 * 作者: wesley
 * 日期: 2021/5/20
 * 描述:
 */
object StringUtils {




    fun isMobiles(phoneNumber: String): Boolean{
        return phoneNumber.length == 11
    }


    fun isNumber(phoneNumber: String): Boolean{
        return phoneNumber == "111222"
    }


    fun isPhoneNumber(): Boolean {
        return false
    }


    fun isIdCard(): Boolean {
        return false
    }
}