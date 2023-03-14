package Baekjoon.math.b_simple_think

import kotlin.math.sqrt

// 실버 III > 소수 구하기
fun main() = with(System.`in`.bufferedReader()) {
    val MAX_NUMBER = 1000000
    
    val (M, N) = readLine().split(' ').map { it.toInt() }
    
    // 소수이면 true 그대로 두고, 아닐 경우 false로 변환합니다.
    val prime = BooleanArray(MAX_NUMBER + 1) { true }
    prime[0] = false
    prime[1] = false
    
    val maxRange = sqrt(MAX_NUMBER.toDouble()).toInt()
    for (number in 2..maxRange) {
        if (prime[number]) {
            for (squareNumber in number * 2..MAX_NUMBER step number) {
                prime[squareNumber] = false
            }
        }
    }
    
    /* 출력 메서드 생성 */
    val sb = StringBuilder()
    for (number in M..N) {
        if (prime[number]) sb.appendLine(number)
        
    }
    
    println(sb)
}