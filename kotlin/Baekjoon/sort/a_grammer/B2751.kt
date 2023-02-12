package Baekjoon.sort.a_grammer

// 실버 V > 수 정렬하기 2
fun main() {
    val N = readln().toInt()
    val numbers = mutableListOf<Int>()
    
    repeat(N) {
        val number = readln().toInt()
        numbers.add(number)
    }
    
    numbers.sort()
    
    val sb = StringBuilder()
    numbers.forEach { sb.appendLine(it) }
    
    println(sb)
}