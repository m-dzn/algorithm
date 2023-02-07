package Baekjoon.datastructure.map

import java.util.StringTokenizer

// 실버 IV > 수 찾기
fun main() {
    val N = readln().toInt()
    var st = StringTokenizer(readln())
    
    val numberMap = HashMap<Int, Int>()
    while (st.hasMoreTokens()) {
        val number = st.nextToken().toInt()
        numberMap.put(number, number)
    }
    
    val M = readln().toInt()
    st = StringTokenizer(readln())
    
    val sb = StringBuilder()
    while (st.hasMoreTokens()) {
        val searchNumber = st.nextToken().toInt()
        sb.appendLine(if (numberMap.containsKey(searchNumber)) 1 else 0)
    }
    
    println(sb)
}