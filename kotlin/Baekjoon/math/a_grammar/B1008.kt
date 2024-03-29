import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 백준 1008번 A/B
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val tokens = StringTokenizer(reader.readLine())

  val A = tokens.nextToken().toDouble()
  val B = tokens.nextToken().toDouble()

  println(A / B)

  reader.close()
}