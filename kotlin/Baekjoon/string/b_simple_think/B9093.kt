package Baekjoon.string.b_simple_think

// 브론즈 I > 단어 뒤집기
fun main() {
    val T = readln().toInt()
    
    val sb = StringBuilder()
    repeat(T) {
        val words = readln().split(' ').map {
            val reversedCharArray = it.toCharArray().reversedArray()
            String(reversedCharArray)
        }
        
        sb.appendLine(words.joinToString(" "))
    }
    
    println(sb)
}