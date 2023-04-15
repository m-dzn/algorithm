package Baekjoon.greedy.b_simple_think

// 브론즈 V > 크냐?
fun main() {
    val bw = System.out.bufferedWriter()
    
    var line = readln()
    
    while (line != "0 0") {
        val (a, b) = line.split(' ').map { it.toInt() }
        
        val answer = if (a > b) "Yes" else "No"
        bw.appendLine(answer)
        
        line = readln()
    }
    
    bw.flush()
    bw.close()
}