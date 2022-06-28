import java.io.*
import java.util.*

// 백준 10818번 최소, 최대
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val N = reader.readLine().toInt()

  var tokens = StringTokenizer(reader.readLine())

  var min = Integer.MAX_VALUE
  var max = Integer.MIN_VALUE
  repeat(N) {
    val currentNum = tokens.nextToken().toInt()

    min = Math.min(min, currentNum)
    max = Math.max(max, currentNum)
  }

  println("$min $max")
  reader.close()
}