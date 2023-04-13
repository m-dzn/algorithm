package Baekjoon.greedy.b_simple_think

import kotlin.math.min

// 브론즈 I > 캠핑
fun main() {
    val bw = System.out.bufferedWriter()
    
    var line = readln()
    var t = 0
    
    while (line != "0 0 0") {
        t++
        
        val (maxCampingDaysInPeriod, consecutiveDays, totalVacationDays) = line.split(' ').map { it.toInt() }
        
        val cycle = totalVacationDays / consecutiveDays
        val remain = totalVacationDays % consecutiveDays
        
        val maxCampingDays = cycle * maxCampingDaysInPeriod + min(remain, maxCampingDaysInPeriod)
        bw.appendLine("Case $t: $maxCampingDays")
        
        line = readln()
    }
    
    bw.flush()
    bw.close()
}