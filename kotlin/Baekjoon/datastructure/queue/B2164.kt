package Baekjoon.datastructure.queue

import java.util.LinkedList
import java.util.Queue

// 실버 IV > 카드 2
fun main() {
    val N = readln().toInt()
    
    val queue: Queue<Int> = LinkedList()
    
    repeat(N) {
        queue.offer(it + 1)
    }
    
    while (queue.size > 1) {
        queue.poll()
        val firstElem = queue.poll()
        queue.offer(firstElem)
    }
    
    println(queue.peek())
}