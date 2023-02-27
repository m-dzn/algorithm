package Baekjoon.bfs.b_simple_think

import java.util.LinkedList
import java.util.Queue

// 실버 III > 1로 만들기
fun main() {
    val N = readln().toInt()
    
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.offer(Pair(N, 0))
    var minComputeCount = 0
    
    while (queue.isNotEmpty()) {
        val (currentValue, count) = queue.poll()
        
        if (currentValue == 1) {
            minComputeCount = count
            break
        }
        
        if (currentValue % 2 == 0) queue.offer(Pair(currentValue / 2, count + 1))
        if (currentValue % 3 == 0) queue.offer(Pair(currentValue / 3, count + 1))
        queue.offer(Pair(currentValue - 1, count + 1))
    }
    
    println(minComputeCount)
}