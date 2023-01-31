package Baekjoon.greedy

// 실버 IV > 설탕 배달
fun main() = with(System.`in`.bufferedReader()) {
    val N = readln().toInt()
    
    var numOfSugarBags = 0
    
    if (N % 5 == 0) {
        numOfSugarBags = N / 5
    } else {
        var remainingWeight = N
        
        while (remainingWeight > 0) {
            remainingWeight -= 3
            numOfSugarBags++
            
            if (remainingWeight == 0) {
                break
            } else if (remainingWeight % 5 == 0) {
                numOfSugarBags += remainingWeight / 5
                break
            } else if (remainingWeight < 3) {
                numOfSugarBags = -1
                break
            }
        }
    }
    
    print(numOfSugarBags)
}