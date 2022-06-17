import java.io.*
import java.util.*
import kotlin.math.*

// 백준 2480번 주사위 세개
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val tokens = StringTokenizer(reader.readLine())

  val (maxScale, maxCount, maxCountScale) = getDiceStats(tokens)

  println(calcPrizeMoney(maxScale, maxCount, maxCountScale))

  reader.close()
}

fun getIntFromToken(tokens: StringTokenizer): Int {
  return tokens.nextToken().toInt()
}

fun getDiceStats(tokens: StringTokenizer): Triple<Int, Int, Int> {
  val diceArray = Array(7) { 0 }
  var maxScale = 1
  var maxCount = 1
  var maxCountScale = 1
  
  while (tokens.hasMoreTokens()) {
    val die = getIntFromToken(tokens)

    diceArray[die] += 1

    if (maxCount < diceArray[die]) {
      maxCount = diceArray[die]
      maxCountScale = die
    }

    maxScale = max(maxScale, die)
  }

  return Triple(maxScale, maxCount, maxCountScale)

}

fun calcPrizeMoney(maxScale: Int, maxCount: Int, maxCountScale: Int): Int {
  when (maxCount) {
    3 -> return 10000 + maxCountScale * 1000
    2 -> return 1000 + maxCountScale * 100
    else -> return maxScale * 100
  }
}