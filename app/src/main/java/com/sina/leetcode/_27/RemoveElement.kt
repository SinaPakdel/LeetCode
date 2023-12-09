package com.sina.leetcode._27

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int = nums.filter { it != `val` }.size
}