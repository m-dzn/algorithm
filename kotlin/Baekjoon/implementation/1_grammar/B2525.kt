import java.io.*
import java.util.StringTokenizer

// 백준 2525번 오븐 시계
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val tokens = StringTokenizer(reader.readLine())

  val H = tokens.nextToken().toInt()
  val M = tokens.nextToken().toInt()

  val cookTime = reader.readLine().toInt()

  println(getTimeAfterMinutes(H, M, cookTime))

  reader.close()
}

fun getTimeAfterMinutes(H: Int, M: Int, elapsedTime: Int): String {
  var hours = H
  var minutes = M + elapsedTime

  if (minutes >= 60) { 
    hours += minutes / 60
    minutes %= 60
  }

  if (hours >= 24) {
    hours %= 24
  }

  return "$hours $minutes"
}