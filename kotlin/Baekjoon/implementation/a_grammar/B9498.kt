// 백준 9498번 시험 성적
fun main() = with(System.`in`.bufferedReader()) {
  val score = readln().toInt()
  val credit = getCreditOfScore(score)

  println(credit)

  close()
}

fun getCreditOfScore(score: Int): Char {
  when (score) {
    in 90..100 -> return 'A'
    in 80..89 -> return 'B'
    in 70..79 -> return 'C'
    in 60..69 -> return 'D'
    else -> return 'F'
  }
}