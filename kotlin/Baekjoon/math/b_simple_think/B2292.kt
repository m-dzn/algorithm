package Baekjoon.math.b_simple_think

// 브론즈 II > 벌집
fun main() {
    val NUMBER_OF_SIDES = 6
    
    val roomNumber = readln().toInt()
    
    var pastRoomsCount = 0
    
    var remain = roomNumber - 1
    while (remain > 0) {
        pastRoomsCount++
        
        remain -= NUMBER_OF_SIDES * pastRoomsCount
    }
    
    println(pastRoomsCount + 1)
}