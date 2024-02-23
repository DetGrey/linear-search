package com.example.linear_search

fun main() {
    val nums: List<Int> = listOf(3,2,4)
    val target = 6
    twoSum(nums, target)
    twoSumSingleIteration(nums, target)
//    twoSum(listOf(-1,-2,-3,-4,-5), -8)
//    twoSum(listOf(-5,20,3,-2,4,1), 18)
//    twoSum(listOf(0,0,3,4), 0)
//    twoSum(listOf(1000,2000,3000,4000), 7000)
//    twoSum(listOf(1,2,3,2,4), 4)
//    twoSum(listOf(5,5,3,8,2,7,4), 9)
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
                println("Explanation: Because ${nums[i]} + ${nums[j]} = $target")
                return
            }
        }
    }
}

// Two sum in single iteration
fun twoSumSingleIteration(nums: List<Int>, target: Int) {
    val hashMap: HashMap<Int, Int> = hashMapOf()

    for (i in nums.indices) {
        hashMap[nums[i]] = i

        val value = target - nums[i]

        if (hashMap[value] != null && hashMap[value] != i) {
            println("[${hashMap[value]}, $i]")
            println("Explanation: Because $value + ${nums[i]} = $target")
            return
        }
    }
}