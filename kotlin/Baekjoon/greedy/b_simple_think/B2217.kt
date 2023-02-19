package Baekjoon.greedy.b_simple_think

// 실버 IV > 로프
fun main() {
    val N = readln().toInt()
    
    val ropes = IntArray(N)
    repeat(N) {index ->
        ropes[index] = readln().toInt()
    }
    
    ropes.sortDescending()
    
    var maxWeight = 0
    for (index in ropes.indices) {
        val numOfRopes = index + 1
        
        val weight = ropes[index] * numOfRopes
        maxWeight = maxWeight.coerceAtLeast(weight)
    }
    
    println(maxWeight)
}