package com.example.linear_search

fun main() {
    val input = arrayOf(10,3,5,4,6,5,3,10,2)
//    firstRepeatingElement(input)


    minimumDistance(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 3, 9, 4))
    minimumDistance(listOf(2, 7, 1, 4, 9, 5))
}

/* # First repeating element
Given a list of integers arr[] The task is to find the index of first repeating element in it i.e.
the element that occurs more than once and whose index of the first occurrence is the smallest.

In this exercise you should use a index-based linear data structure such as an array.

**Example:**
    val input = arrayOf(10,5,4,6,3,5,3,2);
    //Output: 5
    //Explanation: 5 is the first repeating element
 */

fun firstRepeatingElement(array: Array<Int>) {
    val foundNums: MutableList<Int> = mutableListOf()

    val repeatedNums: MutableList<Int> = mutableListOf()

    for (num1 in array) {
        if (foundNums.size == 0) {
            foundNums.add(num1)
        }
        else {
            for (num2 in foundNums) {
//                println("1: $num1, 2: $num2")
                if (num1 == num2) {
                    repeatedNums.add(num1)
                }
            }
            foundNums.add(num1)
        }
    }

    for (num1 in array) {
        for (repeated in repeatedNums) {
            if (num1 == repeated) {
                println(num1)
                println("Explanation: $num1 is the first repeating element with the lowest index")
                return
            }
        }
    }
}

/*
Given an array of integers, find the minimum distance between two repeating elements.
In other words, find the minimum difference between the indices of any two elements
that are equal to each other. If there are no repeating elements in the array, return -1.

Example 1

Input: [0, 1, 2, 3, 4, 5, 6, 7, 8, 3, 9, 4]
Explanation: In this array, the repeating elements are 3 and 4, and their minimum distance is |3 - 9| = 6.

Example 2

Input: [2, 7, 1, 4, 9, 5] Output: -1
Explanation: There are no repeating elements in this array, so the output is -1.
 */

fun minimumDistance(array: List<Int>): Int {
    val foundNums: MutableList<Int> = mutableListOf()

    val repeatedNums: MutableList<Int> = mutableListOf()

    for (num1 in array) {
        if (foundNums.size == 0) {
            foundNums.add(num1)
        }
        else {
            for (num2 in foundNums) {
//                println("1: $num1, 2: $num2")
                if (num1 == num2) {
                    repeatedNums.add(num1)
                }
            }
            foundNums.add(num1)
        }
    }

    val indexMap: MutableMap<Int, Int> = mutableMapOf()

    for (i in array.indices) {
        for (j in repeatedNums.indices) {
            if (array[i] == repeatedNums[j]) {

                if (indexMap[array[i]] == null) {
                    indexMap[array[i]] = -i
                }
                else {
                    indexMap[array[i]] = indexMap[array[i]]!! + i
                }
            }
        }
    }

    var minDistance: Int? = null
    
    for ((key, value) in indexMap) {
        if (minDistance == null) {
            minDistance = value
        }
        else if (value < minDistance) {
            minDistance = value
        }
    }

    for (element in indexMap) {
        if (element.value == minDistance) {
            println("${element.key} is the repeated number with the lowest distance (${element.value})")
            return element.value
        }
    }

    return -1
}