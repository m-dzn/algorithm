package Baekjoon.datastructure.queue.b_simple_think

import java.util.LinkedList

// 실버 IV > 큐 2
fun main() {
    val N = readln().toInt()
    
    val queue = Queue()
    
    repeat(N) {
        val command = readln().split(' ')
        queue.execute(command)
    }
    
    queue.print()
}

private class Queue {
    private val queue = LinkedList<Int>()
    private val sb = StringBuilder()
    
    fun execute(command: List<String>) {
        when (command[0]) {
            "push"  -> queue.offer(command[1].toInt())
            "pop"   -> sb.appendLine(if (queue.isEmpty()) -1 else queue.poll())
            "front" -> sb.appendLine(if (queue.isEmpty()) -1 else queue.first)
            "back"  -> sb.appendLine(if (queue.isEmpty()) -1 else queue.last)
            "size"  -> sb.appendLine(queue.size)
            "empty" -> sb.appendLine(if (queue.isEmpty()) 1 else 0)
        }
    }
    
    fun print() {
        println(sb)
    }
}