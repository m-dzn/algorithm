package Baekjoon.datastructure.array.a_grammar

import java.util.*

// 실버 V > 배열 합치기
fun main() {
    val (N, M) = readln().split(' ').map { it.toInt() }
    
    val numberList = mutableListOf<Int>()
    
    repeat (2) {
        val st = StringTokenizer(readln())
        while (st.hasMoreTokens()) {
            val number = st.nextToken().toInt()
            numberList.add(number)
        }
    }
    
    numberList.sort()
    
    println(numberList.joinToString(" "))
}