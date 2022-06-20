import java.io.*

// 백준 2439번 별 찍기 - 2
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val sb = StringBuilder()

  val N = reader.readLine().toInt()

  for (i in 1..N) {
    for (j in 1..(N - i)) sb.append(' ')
    for (j in 1..i) sb.append('*')
    sb.appendLine()
  }

  println(sb)
  reader.close()
}