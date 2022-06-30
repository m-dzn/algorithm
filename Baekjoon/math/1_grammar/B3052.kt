import java.io.*

// 백준 3052번 나머지
val REPEAT = 10
val BASE_NUM = 42

fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  var count = 0

  val bucket = IntArray(BASE_NUM)
  repeat(REPEAT) {
    val inputNum = reader.readLine().toInt()
    if (bucket[inputNum % BASE_NUM] == 0) {
      count++
    }
    bucket[inputNum % BASE_NUM] = 1
  }

  println(count)
  reader.close()
}