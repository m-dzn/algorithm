package Baekjoon.datastructure.heap.b_simple_think

import java.util.PriorityQueue

// 실버 II > 최대 힙
fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    
    val N = readLine().toInt()
    
    val maxHeap = PriorityQueue<Int>(compareByDescending { it })
    for(i in 0 until N) {
        val elem = readLine().toInt()
        
        if (elem == 0) {
            if (!maxHeap.isEmpty()) {
                bw.write("${maxHeap.poll()}")
                bw.newLine()
            } else {
                bw.write("0\n")
            }
        } else {
            maxHeap.add(elem)
        }
    }
    
    bw.flush()
    bw.close()
}