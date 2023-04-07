package Baekjoon.dfs.c_light_logic

import java.lang.StringBuilder
import java.util.LinkedList
import java.util.Queue

// 실버 II > 유기농 배추
fun main() {
    val output = System.out.bufferedWriter()
    
    val T = readln().toInt()
    
    repeat(T) {
        val graph = Graph()
        val wormCount = graph.countWorm()
        output.write(wormCount.toString())
        output.newLine()
    }
    
    output.flush()
    output.close()
}

private class Graph {
    
    val graph: Array<BooleanArray>
    
    init {
        val (M, N, K) = readln().split(' ').map { it.toInt() }
        graph = Array(N) { BooleanArray(M) }
        repeat(K) {
            val (x, y) = readln().split(' ').map { it.toInt() }
            graph[y][x] = true
        }
    }
    
    companion object {
        val dx = intArrayOf(-1, 0, 1, 0)
        val dy = intArrayOf(0, 1, 0, -1)
    }

    fun countWorm(): Int {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        val visited = Array(graph.size) { BooleanArray(graph[0].size) }
        
        var clusterCount = 0
        
        for (row in graph.indices) {
            for (col in graph[0].indices) {
                if (!graph[row][col]) continue
                if (visited[row][col]) continue
                
                queue.offer(Pair(row, col))
                visited[row][col] = true
                clusterCount++
                
                while (queue.isNotEmpty()) {
                    val (x, y) = queue.poll()
                    
                    for (direction in dx.indices) {
                        val nx = x + dx[direction]
                        val ny = y + dy[direction]
                        
                        if (nx in graph.indices && ny in 0 until graph[0].size) {
                            if (graph[nx][ny] && !visited[nx][ny]) {
                                queue.offer(Pair(nx, ny))
                                visited[nx][ny] = true
                            }
                        }
                    }
                }
            }
        }
        
        return clusterCount
    }
    
}