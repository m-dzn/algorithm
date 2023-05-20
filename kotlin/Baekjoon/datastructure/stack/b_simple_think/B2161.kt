package Baekjoon.datastructure.stack.b_simple_think

import java.util.LinkedList
import java.util.Queue

// 실버 V > 카드1
fun main() {
    val N = readln().toInt()
    
    val queue: Queue<Int> = LinkedList()
    (1..N).forEach { queue.offer(it) }
    
    val bw = System.out.bufferedWriter()
    
    while (queue.isNotEmpty()) {
        val poppedEl = queue.poll()
        bw.append("$poppedEl ")
        
        val elToMove = queue.poll()
        
        if (elToMove != null) queue.offer(elToMove)
    }
    
    bw.flush()
    bw.close()
}