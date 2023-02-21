package Baekjoon.greedy.b_simple_think

// 브론즈 III > 전자레인지
fun main() {
    val T = readln().toInt()
    val BUTTONS = arrayOf(300, 60, 10)
    
    if (T % 10 != 0) {
        println(-1)
    } else {
        var remainingTime = T
        var buttonIndex = 0
        val hits = IntArray(3)
        
        while (remainingTime > 0) {
            val buttonTime = BUTTONS[buttonIndex]
            
            if (buttonTime <= remainingTime) {
                hits[buttonIndex]++
                remainingTime -= buttonTime
            } else {
                buttonIndex++
            }
        }
        
        println(hits.joinToString(" "))
    }
}