// 백준 1110번 더하기 사이클
fun main() = with(System.`in`.bufferedReader()) {
  val N = readln().toInt()

  println(getAddCycle(N))
  close()
}

fun getAddCycle(n: Int): Int {
  var count = 0

  var prevNum = n
  var currentNum = -1

  while(currentNum != n) {
    currentNum = prevNum % 10 * 10 // 10의 자리 수
    currentNum += (prevNum / 10 + prevNum % 10) % 10 // 1의 자리 수
    prevNum = currentNum
    count++
  }

  return count
}