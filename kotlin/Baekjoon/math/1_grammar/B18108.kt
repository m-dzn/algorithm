import java.io.BufferedReader
import java.io.InputStreamReader

// 백준 18108번 1998년생인 내가 태국에서는 2541년생?!
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val buddhistYear = reader.readLine().toInt()
  val BUDDHA_YEAR_DIFF = 543;

  println(buddhistYear - BUDDHA_YEAR_DIFF)

  reader.close()
}