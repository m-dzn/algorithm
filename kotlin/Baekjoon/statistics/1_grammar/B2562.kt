import java.io.*

// 백준 2562번 최댓값
val MAX_ROUND = 9

fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  var position = 0
  var max = Integer.MIN_VALUE

  for (round in 1..MAX_ROUND) {
    val newNum = parseInt(reader.readLine())

    if (max < newNum) {
      max = newNum
      position = round
    }
  }

  println("$max\n$position")
  reader.close()
}

fun parseInt(value: String): Int = value.toInt()