package Baekjoon.dfs

import java.util.*

// 실버 II > DFS와 BFS
fun main() {
    val (N, M, V) = readln().split(' ').map { it.toInt() }
    val graph = Array(N + 1) { IntArray(N + 1) }
    
    repeat(M) {
        val (startNode, endNode) = readln().split(' ').map { it.toInt() }
        graph[startNode][endNode] = 1
        graph[endNode][startNode] = 1
    }
    
    println(B1260.dfs(graph, V))
    println(B1260.bfs(graph, V))
}

private class B1260 {
    companion object {
        fun dfs(graph: Array<IntArray>, startNode: Int): String {
            val sb =                StringBuilder()
            
            val visited =           BooleanArray(graph.size)
            val stack =             Stack<Int>()
            
            // 순회를 위한 데이터 초기화
            stack.push(startNode)
            
            // DFS 순회
            while (stack.isNotEmpty()) {
                val currentNode =   stack.pop()
                
                if (visited[currentNode])                   continue
    
                visited[currentNode] = true
                sb.append(currentNode).append(' ')
                
                for (nextNode in graph[currentNode].size - 1 downTo 1) {
                    if (visited[nextNode])                  continue
                    if (graph[currentNode][nextNode] == 0)  continue
    
                    stack.push(nextNode)
                }
            }
            
            return sb.toString()
        }
        
        fun bfs(graph: Array<IntArray>, startNode: Int): String {
            val sb =                    StringBuilder()
            
            val visited =               BooleanArray(graph.size)
            val queue: Queue<Int> =     LinkedList()
            
            // 데이터 초기화
            queue.offer(startNode)
            
            // BFS 순회
            while (queue.isNotEmpty()) {
                val currentNode =       queue.poll()
    
                if (visited[currentNode])                   continue
    
                visited[currentNode] = true
                sb.append(currentNode).append(' ')
                
                for (nextNode in 1 until graph[currentNode].size) { // 숫자가 작은 정점이 Stack 맨 위로 올라가도록 downTo 적용
                    if (visited[nextNode])                  continue
                    if (graph[currentNode][nextNode] == 0)  continue
                    
                    queue.offer(nextNode)
                }
            }
            
            return sb.toString()
        }
    }
}