package Baekjoon.math.b_simple_think

// 브론즈 III > 직각삼각형
fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    
    var line = readln()
    
    while (line != "0 0 0") {
        val numbers = line.split(' ').map { it.toInt() }
        
        var squareSum = 0
        var maxSquare = 0
        
        for (number in numbers) {
            val square = number * number
            squareSum += square
            
            if (square > maxSquare) maxSquare = square
        }
        
        sb.appendLine(if (squareSum == 2 * maxSquare) "right" else "wrong")
        
        line = readln()
    }
    
    println(sb)
}