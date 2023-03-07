package Baekjoon.datastructure.map

import java.util.StringTokenizer

// 실버 IV > 숫자 카드 2
fun main() {
    val N = readln().toInt()
    
    val map = mutableMapOf<Int, Int>()
    
    var st = StringTokenizer(readln())
    while (st.hasMoreTokens()) {
        val number = st.nextToken().toInt()
        
        map[number] = map.getOrDefault(number, 0) + 1
    }
    
    val M = readln().toInt()
    
    val sb = StringBuilder()
    st = StringTokenizer(readln())
    while (st.hasMoreTokens()) {
        val numberToPrint = st.nextToken().toInt()
        val count = map[numberToPrint] ?: 0
        sb.append(count).append(' ')
    }
    
    println(sb)
}