import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 백준 1330번 두 수 비교하기
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val tokens = StringTokenizer(reader.readLine())

  val A = tokens.nextToken().toInt()
  val B = tokens.nextToken().toInt()

  var comparison = if (A > B) ">" else "<"
  comparison = if (A == B) "==" else comparison

  println(comparison)

  reader.close()
}