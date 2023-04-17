package Baekjoon.datastructure.set.b_simple_think

// 실버 V > 회사에 있는 사람
fun main() {
    val numOfEmployee = readln().toInt()
    
    val attendantSet = mutableSetOf<String>()
    
    repeat (numOfEmployee) {
        val (name, state) = readln().split(' ')
        
        when (state) {
            "enter" -> attendantSet.add(name)
            "leave" -> attendantSet.remove(name)
        }
    }
    
    val attendantList = attendantSet.sortedDescending()
    
    val bw = System.out.bufferedWriter()
    
    attendantList.forEach { bw.appendLine(it) }
    
    bw.flush()
    bw.close()
}