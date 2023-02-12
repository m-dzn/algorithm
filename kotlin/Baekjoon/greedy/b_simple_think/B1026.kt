package Baekjoon.greedy.b_simple_think

// 실버 IV > 보물
fun main() {
    val N = readln().toInt()
    val arrOfA = readln().split(' ').map { it.toInt() }.toMutableList()
    val arrOfB = readln().split(' ').map { it.toInt() }.toMutableList()
    
    arrOfA.sortDescending()
    arrOfB.sort()
    
    val min = arrOfA.foldIndexed(0) { i, acc, a ->
        acc + arrOfA[i] * arrOfB[i]
    }
    
    println(min)
}