package Baekjoon.datastructure.stack.b_simple_think

import java.util.Stack

// 실버 IV > 괄호
fun main() {
    val T = readln().toInt()
    
    val sb = StringBuilder()
    repeat(T) {
        val stack = Stack<Char>()
        
        val parentheses = readln()
        for (ch in parentheses) { stack.push(ch) }
        
        val numOfParentheses = arrayOf(0, 0)
        var answer = "YES"
        while (stack.isNotEmpty()) {
            val parenthesis = stack.pop()
            
            if (parenthesis == '(') numOfParentheses[0]++
            else                    numOfParentheses[1]++
            
            if (numOfParentheses[0] > numOfParentheses[1]) {
                answer = "NO"
                break
            }
        }
        
        if (numOfParentheses[0] != numOfParentheses[1]) answer = "NO"
        
        sb.appendLine(answer)
    }
    
    println(sb)
}