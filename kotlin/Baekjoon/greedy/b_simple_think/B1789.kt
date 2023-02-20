package Baekjoon.greedy.b_simple_think

// 실버 V > 수들의 합
fun main() {
    val S = readln().toLong()
    
    var sum = 0L
    var num = 0L
    while (sum <= S) {
        num++
        sum += num
    }
    
    val maxNum = num - 1
    
    println(maxNum)
}