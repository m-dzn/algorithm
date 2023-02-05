package Baekjoon.datastructure.stack

import java.util.Stack

// 실버 IV > 스택
fun main() {
    val N = readln().toInt()
    
    repeat(N) {
        val command = readln().split(' ')
        
        B10828.execute(command)
    }
    
    B10828.print()
}

private object B10828 {
    val sb = StringBuilder()
    val stack = Stack<Int>()
    
    fun execute(command: List<String>) {
        when (command[0]) {
            "push" ->   stack.push(command[1].toInt())
            "pop" ->    sb.appendLine(pop())
            "size" ->   sb.appendLine(stack.size)
            "empty" ->  sb.appendLine(empty())
            "top" ->    sb.appendLine(top())
        }
    }
    
    fun pop(): Int {
        return if (stack.isNotEmpty()) stack.pop() else -1
    }
    fun empty(): Int {
        return if (stack.isEmpty()) 1 else 0
    }
    fun top(): Int {
        return if (stack.isNotEmpty()) stack.peek() else -1
    }
    
    fun print() {
        println(sb)
    }
}