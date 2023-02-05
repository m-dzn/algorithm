// 백준 2753번 윤년
fun main() = with(System.`in`.bufferedReader()) {
  val year = readln().toInt()
  println(isLeapYear(year))

  close()
}

fun isLeapYear(year: Int): Int {
  return if (year % 4 == 0 && year % 100 != 0) 1 else
    if (year % 400 == 0) 1 else 0
}