import java.io.*

// 백준 8958번 OX퀴즈
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val sb = StringBuilder()

  val T = reader.readLine().toInt()

  repeat(T) {
    sb.appendLine(getScore(reader.readLine()))
  }

  println(sb)
  reader.close()
}

fun getScore(line: String): Int {
  var streak = 0
  return line.toCharArray().fold(0) { total, answer ->
    if (answer == 'O') streak++ else streak = 0
    total + streak
  }
}