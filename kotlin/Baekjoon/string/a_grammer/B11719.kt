package Baekjoon.string.a_grammer

// 브론즈 III > 그대로 출력하기 2
fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    
    forEachLine { bw.appendLine(it) }
    
    bw.flush()
    bw.close()
}
