package Baekjoon.string.a_grammer

// 브론즈 III > 별 찍기 - 4
fun main() {
    val N = readln().toInt()
    
    val bw = System.out.bufferedWriter()
    for (i in N downTo 1) {
        val line = " ".repeat(N - i) + "*".repeat(i)
        bw.appendLine(line)
    }
    
    bw.flush()
    bw.close()
}