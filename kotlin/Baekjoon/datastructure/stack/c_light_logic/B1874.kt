package Baekjoon.datastructure.stack.c_light_logic

import java.util.Stack

// 실버 II > 스택 수열
fun main() {
    val n = readln().toInt()
    
    for(i in 1..n) {
        val number = readln().toInt()
        
        if (!StackSequence.check(number)) {
            StackSequence.setNo()
            break
        }
    }
    
    StackSequence.print()
}

private object StackSequence {
    private val stack = Stack<Int>()
    private val sb = StringBuilder()
    
    val top: Int
        get() = if (stack.isEmpty())    0
                else                    stack.peek()
    
    var lastInsertNumber = 0
    
    fun check(number: Int): Boolean {
        val sign = getSign(number)
        
        if (sign == '?') return false
        
        if (sign == '+') {
            repeat (number - lastInsertNumber) {
                stack.push(++lastInsertNumber)
                sb.appendLine(sign)
            }
            
            stack.pop()
            sb.appendLine('-')
        } else {
            while (!stack.isEmpty()) {
                val popped = stack.pop()
                sb.appendLine(sign)
                
                if (popped <= number) break
            }
        }
        
        return true
    }
    
    private fun getSign(number: Int): Char {
        return  if      (number in (top + 1) until lastInsertNumber)  { '?' }
                else if (isGreaterThanTop(number))                          { '+' }
                else                                                        { '-' }
    }
    
    private fun isGreaterThanTop(number: Int): Boolean {
        return top < number
    }
    
    fun setNo() {
        sb.clear()
        sb.append("NO")
    }
    
    fun print() {
        println(sb)
    }
}