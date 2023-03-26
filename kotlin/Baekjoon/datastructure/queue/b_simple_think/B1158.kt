package Baekjoon.datastructure.queue.b_simple_think

import java.util.LinkedList
import java.util.Queue

// 실버 IV > 요세푸스 문제
fun main() {
    val (N, K) = readln().split(' ').map { it.toInt() }
    
    val sb = StringBuilder()
    sb.append('<')
    
    val queue: Queue<Int> = LinkedList()
    for (num in 1..N) queue.offer(num)
    
    while (queue.isNotEmpty()) {
        repeat (K - 1) {
            val poppedNumber = queue.poll()
            queue.offer(poppedNumber)
        }
        
        val removedNumber = queue.poll()
        sb.append(removedNumber).append(", ")
    }
    
    sb.delete(sb.length - 2, sb.length)
    sb.append('>')
    println(sb)
}