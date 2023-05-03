package Baekjoon.greedy.c_light_logic

// 실버 V > 뒤집기
fun main() {
    val line = readln()
    
    var flipFor0 = 0
    var flagFor0 = false
    
    var flipFor1 = 0
    var flagFor1 = false
    
    for (char in line) {
        val num = char.digitToInt()
        
        if (num == 1) {
            if (!flagFor0) flipFor0++
            
            flagFor0 = true
            flagFor1 = false
        } else {
            if (!flagFor1) flipFor1++
            
            flagFor0 = false
            flagFor1 = true
        }
    }
    
    println(flipFor0.coerceAtMost(flipFor1))
}