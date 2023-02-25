package Baekjoon.greedy.b_simple_think

// 실버 III > 수리공 항승
fun main() {
    val (N, tapeLength) = readln().split(' ').map { it.toInt() }
    val leakPositions = readln().split(' ').map { it.toInt() }.sorted()
    
    var numOfTapes = 1
    
    var startPosition = leakPositions[0]
    for (i in 1 until leakPositions.size) {
        val leakPosition = leakPositions[i]
        val leakLength = leakPosition - startPosition
        
        if (leakLength > tapeLength - 1) {
            startPosition = leakPosition
            numOfTapes++
        }
    }
    
    println(numOfTapes)
}