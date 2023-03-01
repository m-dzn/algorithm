package Baekjoon.math.a_grammar

import java.util.StringTokenizer

// 브론즈 V > 영수증
fun main() {
    val X = readln().toInt()
    val N = readln().toInt()
    
    var total = 0
    
    repeat(N) {
        val st = StringTokenizer(readln())
        val price = st.nextToken().toInt()
        val quantity = st.nextToken().toInt()
        
        total += price * quantity
    }
    
    val answer = if (X == total) "Yes" else "No"
    
    println(answer)
}