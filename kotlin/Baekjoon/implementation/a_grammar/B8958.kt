// 백준 8958번 OX퀴즈
fun main() = with(System.`in`.bufferedReader()) {
  val sb = StringBuilder()

  val T = readln().toInt()

  repeat(T) {
    sb.appendLine(getScore(readln()))
  }

  println(sb)
  close()
}

fun getScore(line: String): Int {
  var streak = 0
  return line.toCharArray().fold(0) { total, answer ->
    if (answer == 'O') streak++ else streak = 0
    total + streak
  }
}