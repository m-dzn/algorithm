import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 백준 1008번 A/B
fun main() {
  var reader = BufferedReader(InputStreamReader(System.`in`))
  var tokens = StringTokenizer(reader.readLine())

  var A = tokens.nextToken().toDouble()
  var B = tokens.nextToken().toDouble()

  println(A / B)

  reader.close()
}