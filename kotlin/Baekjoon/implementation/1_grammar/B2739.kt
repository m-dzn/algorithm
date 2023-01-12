import java.io.*

// 백준 2739번 구구단
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val N = reader.readLine().toInt()

  printTimesTableOf(N)

  reader.close()
}

fun printTimesTableOf(n: Int) {
  val sb = StringBuilder()

  for (times in 1..9) {
    sb.appendLine("$n * $times = ${n * times}")
  }

  println(sb)
}