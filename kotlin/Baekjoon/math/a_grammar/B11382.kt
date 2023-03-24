package Baekjoon.math.a_grammar

// 브론즈 V > 꼬마 정민
fun main() = with(System.`in`.bufferedReader()) {
    val sum = readLine().split(' ').sumOf { it.toLong() }
    
    val bw = System.out.bufferedWriter()
    
    bw.write(sum.toString())
    
    bw.flush()
    bw.close()
}