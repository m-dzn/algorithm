package Baekjoon.datastructure.map

// 실버 IV > 듣보잡
fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readln().split(' ').map { it.toInt() }
    
    val neverHeardMap = mutableMapOf<String, String>()
    
    repeat(N) {
        val name = readln()
        neverHeardMap[name] = name
    }
    
    val neverHeardSeenList = mutableListOf<String>()
    val sb = StringBuilder()
    repeat(M) {
        val name = readln()
        if (neverHeardMap.containsKey(name)) {
            neverHeardSeenList.add(name)
        }
    }
    
    sb.appendLine(neverHeardSeenList.size)
    neverHeardSeenList.sort()
    neverHeardSeenList.forEach { sb.appendLine(it) }
    println(sb)
}