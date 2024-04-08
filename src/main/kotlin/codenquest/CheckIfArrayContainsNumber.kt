package org.example.codenquest

/**
 * Check if Array Contains Number
 *
 * ARRAY
 *
 * Determine if a given number is present in an array of integers
 *
 * -----------------------------------------------------------------
 * Problem
 * Given an array of integers array and an integer num, return true if num is an element in array, and false otherwise.
 *
 * Examples
 * arrayContainsNumber([1, 2, 3, 4, 5], 3)
 * // true
 *
 * arrayContainsNumber([10, 20, 30, 40, 50], 25)
 * // false
 *
 * arrayContainsNumber([7, 14, 21, 28], 21)
 * // true
 *
 * arrayContainsNumber([], 42)
 * // false
 */
fun arrayContainsNumber(array: List<Int>, num: Int): Boolean {
    return array.contains(num)
}

fun main() {
    val result = arrayContainsNumber(listOf(1, 2, 3, 4, 5), 3)
    println(result)
}