package Baekjoon.implementation.b_simple_think

// 브론즈 III > 별 찍기 - 5
fun main() {
    val N = readln().toInt()
    
    val bw = System.out.bufferedWriter()
    for (i in 0 until N) {
        for (j in 1 until N - i) bw.append(' ')
        for (k in 0 until (2 * i + 1)) bw.append('*')
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}