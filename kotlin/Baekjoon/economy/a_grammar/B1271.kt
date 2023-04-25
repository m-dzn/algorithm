package Baekjoon.economy.a_grammar

// 브론즈 V > 엄청난 부자2
fun main() {
    val (n, m) = readln().split(' ').map { it.toBigDecimal() }
    
    val (allotment, remainder) = n.divideAndRemainder(m)
    
    val bw = System.out.bufferedWriter()
    bw.appendLine(allotment.toPlainString())
    bw.appendLine(remainder.toPlainString())
    
    bw.flush()
    bw.close()
}