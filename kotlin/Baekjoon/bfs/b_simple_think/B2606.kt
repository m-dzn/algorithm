package Baekjoon.bfs.b_simple_think

import java.util.*

// 실버 III > 바이러스
fun main() {
    B2606.getInputs()
    
    val numOfInfectedComputers = B2606.getInfectedComputerCount()
    
    println(numOfInfectedComputers)
}

private object B2606 {
    private lateinit var graph: Array<IntArray>
    private lateinit var visitedFlags: BooleanArray
    
    fun getInputs() {
        val numOfComputers = readln().toInt()
        val numOfNodes = readln().toInt()
        
        graph = Array(numOfComputers + 1) { IntArray(numOfComputers + 1) }
        repeat(numOfNodes) {
            val st = StringTokenizer(readln())
            val startAt = st.nextToken().toInt()
            val endAt = st.nextToken().toInt()
            
            graph[startAt][endAt] = 1
            graph[endAt][startAt] = 1
        }
    }
    
    fun getInfectedComputerCount(): Int {
        var count = 0
        
        val queue = initBFS(graph.size)
        
        while (queue.isNotEmpty()) {
            val current = queue.poll()
            
            for (next in 1 until graph[current].size) {
                if (isUnreachableOrVisited(current, next)) continue
                
                visitedFlags[next] = true
                count++
                queue.offer(next)
            }
        }
        
        return count
    }
    
    private fun initBFS(numOfNodes: Int): Queue<Int> {
        val queue: Queue<Int> = LinkedList()
        visitedFlags = BooleanArray(numOfNodes + 1)
    
        val startAt = 1
        
        queue.offer(startAt)
        visitedFlags[startAt] = true
        
        return queue
    }
    
    private fun isUnreachableOrVisited(current: Int, next: Int) =
        graph[current][next] == 0 || visitedFlags[next]
}