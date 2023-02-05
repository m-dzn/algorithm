import java.io.*

// 백준 11654번 아스키 코드
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  readln().forEach { println(it.code) }
}