import java.io.*
import java.util.StringTokenizer

// 백준 2884번 알람 시계
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val tokens = StringTokenizer(reader.readLine())

  val H = tokens.nextToken().toInt()
  val M = tokens.nextToken().toInt()

  println(get45MinutesAgo(H, M))

  reader.close()
}

fun get45MinutesAgo(H: Int, M: Int): String {
  var hours = H
  var minutes = M - 45

  if (minutes < 0) {
    hours -= 1
    minutes += 60
  }

  if (hours < 0) {
    hours += 24
  }

  return "$hours $minutes"
}