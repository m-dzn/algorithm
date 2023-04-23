package Baekjoon.string.a_grammer

// 브론즈 IV > 별 찍기 - 3
fun main() {
    val N = readln().toInt()
    
    val bw = System.out.bufferedWriter()
    repeat (N) { i ->
        bw.appendLine("*".repeat(N - i))
    }
    
    bw.flush()
    bw.close()
}