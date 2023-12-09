package com.sina.leetcode._67

class AddBinary {
//    fun addBinary(a: String, b: String): String {
//        return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
//    }

    fun addBinary(a: String, b: String): String {
        var carry = 0
        var result = ""
        var i = a.length - 1
        var j = b.length - 1
        println("$i     $j")
        while (i >= 0 || j >= 0 || carry != 0) {
            val digitA = if (i >= 0) a[i].toString().toInt() else 0
            val digitB = if (j >= 0) b[j].toString().toInt() else 0

            val sum = digitA + digitB + carry
            val digitSum = sum % 2
            carry = sum / 2

            result = digitSum.toString() + result

            i--
            j--
        }

        return result
    }
}