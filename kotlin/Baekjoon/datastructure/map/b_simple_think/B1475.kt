package Baekjoon.datastructure.map.b_simple_think

import kotlin.math.max

// 실버 V > 방 번호
fun main() {
    val digits = readln()
    
    val numberFrequency = IntArray(10)
    
    var maxFrequency = 0
    for (chNumber in digits) {
        var number = chNumber.digitToInt()
        
        if (number == 6 || number == 9) {
            if (numberFrequency[6] > numberFrequency[9]) {
                numberFrequency[9]++
                number = 9
            } else {
                numberFrequency[6]++
                number = 6
            }
        } else {
            numberFrequency[number]++
        }
        
        maxFrequency = max(maxFrequency, numberFrequency[number])
    }
    
    println(maxFrequency)
}