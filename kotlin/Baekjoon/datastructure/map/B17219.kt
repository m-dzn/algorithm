import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 실버 IV > 비밀번호 찾기
 *
 * [Link](https://www.acmicpc.net/problem/17219)
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringBuilder = StringBuilder()
    
    val (savedUrlCount, passwordToFindCount) = readLine().split(' ').map { it.toInt() }
    
    val urlMap = HashMap<String, String>()
    repeat (savedUrlCount) {
        val (url, password) = readLine().split(' ')
        urlMap[url] = password
    }
    
    repeat (passwordToFindCount) {
        val url = readLine()
        val password = urlMap[url]
        stringBuilder.appendLine(password)
    }
    
    println(stringBuilder)
}