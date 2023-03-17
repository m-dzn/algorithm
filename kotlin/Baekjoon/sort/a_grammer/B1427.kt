package Baekjoon.sort.a_grammer

// 실버 V > 소트인사이드
fun main() {
    val N = readln().toCharArray().map { it.digitToInt() }.toMutableList()
    N.sortDescending()
    
    println(N.joinToString(""))
}