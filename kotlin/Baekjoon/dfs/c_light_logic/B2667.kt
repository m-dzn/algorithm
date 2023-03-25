package Baekjoon.dfs.c_light_logic

import java.util.Stack

// 실버 I > 단지번호붙이기
fun main() {
    val N = readln().toInt()
    
    // 1단계 단지를 입력받습니다.
    val mapData: Array<BooleanArray> = Array(N) { readln().map { char -> char == '1' }.toBooleanArray() }
    
    // 2단계 그래프를 클래스로 설계합니다. (생성 시 0과 1로 된 String 지도 데이터를 입력받습니다.)
    val map: Map            = ArrayMap(mapData)
    
    // 3단계 단지 (Cluster) 의 노드 수를 배열로 반환하는 메서드를 인터페이스에 선언 후 구현합니다.
    // 4단계 노드 수 배열을 구합니다.
    val nodesByClusters     = map.countNodesByClusters()
    
    // 5단계 클러스터 수를 구합니다.
    val clusterCount        = nodesByClusters.size
    
    // 6단계 노드 수 배열을 오름차순으로 정렬합니다.
    nodesByClusters.sort()
    
    // 7단계 정답을 출력합니다.
    printResult(
        clusterCount.toString(),
        *toStringArray(nodesByClusters)
    )
}


/* ------------------------------
 *  Functions
 * ------------------------------ */

private fun toStringArray(arr: IntArray): Array<String>
    = arr.map { it.toString() }.toTypedArray()

private fun printResult(vararg args: String) {
    val bw = System.out.bufferedWriter()
    
    args.forEach { bw.appendLine(it) }
    
    bw.flush()
    bw.close()
}


/* ------------------------------
 *  Interfaces
 * ------------------------------ */

private interface Map {
    fun countNodesByClusters(): IntArray
}


/* ------------------------------
 *  Classes
 * ------------------------------ */

private class ArrayMap(val map: Array<BooleanArray>): Map {
    companion object {
        private val dx = intArrayOf(-1, 1, 0, 0)
        private val dy = intArrayOf(0, 0, -1, 1)
    }
    
    private val rowSize: Int
        get() = map.size
    
    private val colSize: Int
        get() = map[0].size
    
    override fun countNodesByClusters(): IntArray {
        // 1단계: 방문한 노드를 체크하기 위한 배열을 만듭니다.
        val visited = Array(rowSize) { BooleanArray(colSize) }
        
        // 2단계: 클러스터별 노드 수를 저장할 리스트를 만듭니다.
        // * 왜 리스트를 쓸까요?  클러스터 개수가 총 몇 개인지 알 수 없기 때문입니다.
        val nodesByClusters = mutableListOf<Int>()
        
        // 3단계: 지도를 탐색하며 노드 개수를 셉니다.
        exploreMapToCountNodes(visited, nodesByClusters)
        
        // 4단계: 탐색 결과를 반환합니다.
        return nodesByClusters.toIntArray()
    }
    
    private fun exploreMapToCountNodes(visited: Array<BooleanArray>, nodesByClusters: MutableList<Int>) {
        // 1단계: 지도를 Brute force로 순회합니다.
        for (row in map.indices) {
            for (col in map[row].indices) {
                // 2단계: 선택된 지도 좌표가 새 클러스터에 속하지 않으면 건너뜁니다.
                if (!isNewCluster(row, col, visited)) continue
                
                // 3단계: 새 클러스터에 진입할 경우 클러스터의 노드 개수를 모두 세면서 방문 처리합니다.
                val nodeCount = countAndMarkNodesOfCluster(row, col, visited)
                nodesByClusters.add(nodeCount)
            }
        }
    }
    private fun isNewCluster(row: Int, col: Int, visited: Array<BooleanArray>)
        = map[row][col] && !visited[row][col]
    
    private fun countAndMarkNodesOfCluster(startX: Int, startY: Int, visited: Array<BooleanArray>): Int {
        var count = 0
        
        val stack = Stack<Pair<Int, Int>>()
        stack.push(startX to startY)
        visited[startX][startY] = true
        
        while (stack.isNotEmpty()) {
            val (x, y) = stack.pop()
            count++
            
            for (direction in dx.indices) {
                val nx = x + dx[direction]
                val ny = y + dy[direction]
                
                if (!isVisitable(nx, ny, visited)) continue
                
                stack.push(nx to ny)
                visited[nx][ny] = true
            }
        }
        
        return count
    }
    private fun isVisitable(nx: Int, ny: Int, visited: Array<BooleanArray>): Boolean
        = nx in map.indices && ny in map[0].indices && map[nx][ny] && !visited[nx][ny]
}

