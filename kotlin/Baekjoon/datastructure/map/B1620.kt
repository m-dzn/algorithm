package Baekjoon.datastructure.map

// 실버 IV > 나는야 포켓몬 마스터 이다솜
fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    
    val (pokemonCount, quizCount) = readln().split(' ').map { it.toInt() }
    
    val pokedex = Pokedex(pokemonCount)
    
    repeat(quizCount) {
        val quiz = readln()
        val answer = pokedex.search(quiz)
        sb.appendLine(answer)
    }
    
    print(sb)
}

private class Pokedex(pokemonCount: Int) {
    private val map = mutableMapOf<String, String>()
    
    init {
        repeat(pokemonCount) { index ->
            val pokemon = readln()
            val dexNumber = (index + 1).toString()
            map[pokemon] = dexNumber
            map[dexNumber] = pokemon
        }
    }
    
    fun search(key: String) = map[key]
}