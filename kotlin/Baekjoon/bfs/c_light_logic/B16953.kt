package Baekjoon.bfs.c_light_logic

import java.util.LinkedList
import java.util.Queue

// 실버 II > A → B
fun main() {
    val (A, B) = readln().split(' ').map { it.toLong() }
    
    val queue: Queue<Pair<Long, Int>> = LinkedList()
    queue.offer(Pair(A, 1))
    
    var answer = -1
    
    // BFS : 필요한 연산의 최소값을 구합니다.
    while (queue.isNotEmpty()) {
        val (num, count) = queue.poll()
        
        if (num == B) {
            answer = count
            break
        }
        
        // num * 2 가지로 진입
        if (num * 2 <= B) {
            queue.offer(Pair(num * 2, count + 1))
        }
    
        // num * 10 + 1 가지로 진입
        if (num * 10 + 1 <= B) {
            queue.offer(Pair(num * 10 + 1, count + 1))
        }
    }
    
    println(answer)
}