package Baekjoon.combination.b_simple_think

// 실버 III > 패션왕 신해빈
fun main() {
    val T = readln().toInt()
    
    val sb = StringBuilder()
    repeat(T) {
        val n = readln().toInt()
        val fashionMap = mutableMapOf<String, Int>()
        
        repeat(n) {
            val (item, kind) = readln().split(' ')
            fashionMap[kind] = (fashionMap[kind] ?: 0) + 1
        }
    
        // 해당 종류의 의상을 안 입는 경우를 추가해 곱한 뒤
        val numberOfCases = fashionMap.values.fold(1) { acc, quantity -> acc * (quantity + 1) }
        
        // 알몸인 경우를 제외하고 출력합니다.
        sb.appendLine(numberOfCases - 1)
    }
    
    println(sb)
}