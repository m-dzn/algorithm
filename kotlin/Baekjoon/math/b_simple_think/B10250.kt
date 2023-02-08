package Baekjoon.math.b_simple_think

// 브론즈 III > ACM 호텔
fun main() {
    val T = readln().toInt()
    
    val sb = StringBuilder()
    repeat(T) {
        val (H, W, N) = readln().split(' ').map { it.toInt() }
        val floor = (N - 1) % H + 1
        val unit = ((N - 1) / H + 1).toString().padStart(2, '0')
        val assignedUnit = "$floor$unit"
        sb.appendLine(assignedUnit)
    }
    
    println(sb)
}

