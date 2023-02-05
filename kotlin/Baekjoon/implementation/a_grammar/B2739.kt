// 백준 2739번 구구단
fun main() = with(System.`in`.bufferedReader()) {
  val N = readln().toInt()

  printTimesTableOf(N)

  close()
}

fun printTimesTableOf(n: Int) {
  val sb = StringBuilder()

  for (times in 1..9) {
    sb.appendLine("$n * $times = ${n * times}")
  }

  println(sb)
}