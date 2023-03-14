package Baekjoon.datastructure.heap.b_simple_think

import java.util.PriorityQueue

// 실버 II > 최소 힙
fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    
    val N = readLine().toInt()
    
    val minHeap = PriorityQueue<Int>()
    for(i in 0 until N) {
        val elem = readLine().toInt()
        
        if (elem == 0) {
            if (!minHeap.isEmpty()) {
                bw.write("${minHeap.poll()}")
                bw.newLine()
            } else {
                bw.write("0\n")
            }
        } else {
            minHeap.add(elem)
        }
    }
    
    bw.flush()
    bw.close()
}