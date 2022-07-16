import java.io.*

// 백준 11654번 아스키 코드
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  readLine().forEach { println(it.code) }
}