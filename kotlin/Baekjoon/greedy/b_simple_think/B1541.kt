package Baekjoon.greedy.b_simple_think

// 실버 II > 잃어버린 괄호
fun main() {
    val equation = readln()
    
    val splittedEquation = equation.split('-')
    
    val number = splittedEquation[0].split('+').sumOf { it.toInt() }
    var subtrahend = 0
    for (i in 1 until splittedEquation.size) {
        val numbers = splittedEquation[i].split('+').map { it.toInt() }
       subtrahend += numbers.sum()
    }
    
    println(number - subtrahend)
}