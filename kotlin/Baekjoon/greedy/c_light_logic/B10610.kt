package Baekjoon.greedy.c_light_logic

// 실버 IV > 30
fun main() {
    val N = readln()
    
    var answer = "-1"
    
    if (isMultipleOf10(N) && isMultipleOf3(N)) {
        val sortedN = N.toCharArray().sortedDescending().joinToString("")
        answer = sortedN
    }
    
    println(answer)
}

private fun isMultipleOf10(N: String): Boolean {
    return N.contains('0')
}

private fun isMultipleOf3(N: String): Boolean {
    val sum = N.sumOf { Character.getNumericValue(it) }
    return sum % 3 == 0;
}