package com.example.linear_search

fun main() {
    val list = (1..50).toList()
    val list2 = listOf(1,2,4,5,6,7,8,9,10)
//    println(binarySearch(list, 26, 0, list.size))
//    println(binarySearch(list2, 3, 0, list2.size))
    println(binarySearch2(list, 33))
}

/*
Implement Binary Search
- You can assume that the array is non-empty.
- You can assume that the array is already sorted.
 */

fun binarySearch(array: List<Int>, target: Int, min: Int, max: Int): Int {
    if ( min > max || min == max ) {
        return -1
    }

    val mid = (min + max) / 2

    println("Min: $min, max: $max, mid: $mid")

    println("mid value: ${array[mid]}")

    return if (array[mid] == target) {
        println("Index found at $mid")
        mid
    }
    else if (target > array[mid]) {
        binarySearch(array, target, mid + 1, max)
    }
    else {
        binarySearch(array, target, min, mid - 1)
    }
}

fun binarySearch2(array: List<Int>, target: Int): Int {
    var min = 0
    var max = array.size

    if (min == max ) {
        return -1
    }

    while (min <= max) {
        val mid = (min + max) / 2

        println("Min: $min, max: $max, mid: $mid")

        println("mid value: ${array[mid]}")

        when {
            array[mid] == target -> return mid
            array[mid] > target -> max = mid
            array[mid] < target -> min = mid
        }
    }
    return -1
}