package Baekjoon.math.b_simple_think

// 실버 V > 셀프 넘버
fun main() = with(System.out.bufferedWriter()) {
    val selfNumbers = BooleanArray(10001) { true }
    
    var number = 1
    while (number < 10000) {
        var result = number
        var remain = number
        
        while (remain > 0) {
            result += remain % 10
            remain /= 10
        }
    
        number++
        
        if (result > 10000) continue
        
        selfNumbers[result] = false
    }
    
    for (i in 1 .. 10000) {
        if (selfNumbers[i]) {
            write(i.toString())
            newLine()
        }
    }
    
    flush()
}