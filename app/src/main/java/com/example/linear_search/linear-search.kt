package com.example.linear_search

fun main() {
    val input = arrayOf(10,3,5,4,6,5,3,2)
    firstRepeatingElement(input)
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

    for (num1 in array) {
        if (foundNums.size == 0) {
            foundNums.add(num1)
        }
        for (num2 in foundNums) {
            if (num1 == num2) {
                println(num1)
                return
            }
            else {
                foundNums.add(num1)
            }
        }
    }

    println("No repeating element found")
}