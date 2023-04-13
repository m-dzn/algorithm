package Baekjoon.date.b_simple_think

// 브론즈 I > 2007년
fun main() {
    val (x, y) = readln().split(' ').map { it.toInt() }
    
    val elapsedDays = getElapsedDays(x, y)
    val dayName = getDayName(elapsedDays)
    
    println(dayName)
}

private fun getElapsedDays(x: Int, y: Int): Int {
    val DAYS = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    
    var elapsedDays = y
    
    for (month in 0 until x - 1) {
        elapsedDays += DAYS[month]
    }
    
    return elapsedDays
}

private fun getDayName(elapsedDays: Int): String {
    val DAY_NAME = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    
    val remains = elapsedDays % 7
    
    return DAY_NAME[remains]
}