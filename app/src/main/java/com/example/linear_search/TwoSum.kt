package com.example.linear_search

fun main() {
    val nums: List<Int> = listOf(3,2,4)
    val target = 6
    twoSum(nums, target)
    twoSum(listOf(), 7)
}

/*
Given an array of integers `nums` and an integer `target`, return _indices of the two numbers
such that they add up to `target`_.

You may assume that each input would have ***exactly* one solution**, and you may not use
the _same_ element twice.

You can return the answer in any order.

**Example 1:**

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

**Example 2:**

Input: nums = [3,2,4], target = 6
Output: [1,2]

**Example 3:**

Input: nums = [3,3], target = 6
Output: [0,1]
 */

fun twoSum(nums: List<Int>, target: Int) {
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (nums[i] + nums[j] == target && i != j) {
                println("[$i, ${j}]")
                println("Explanation: Because ${nums[i]} + ${nums[j]} == $target")
                return
            }
        }
    }
}