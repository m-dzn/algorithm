import java.io.*

// 백준 8393번 합
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val n = reader.readLine().toInt()

  println(getSummationOf(n))
  reader.close()
}

fun getSummationOf(n: Int): Int {
  return n * (n + 1) / 2
}