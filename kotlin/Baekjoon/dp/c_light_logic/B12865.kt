package Baekjoon.dp.c_light_logic

import java.util.StringTokenizer
import kotlin.math.max

// 골드 V > 평범한 배낭
fun main() {
    B12865.getInputs()
    
    val maxSumOfItemValues = B12865.getMaxSumOfItemValues()
    
    println(maxSumOfItemValues)
}

private object B12865 {
    private lateinit var itemList: Array<Item>
    private var numOfItems = 0
    private var weightLimit = 0
    
    fun getInputs() {
        val (N, K) = readln().split(' ').map { it.toInt() }
        numOfItems = N
        weightLimit = K
        
        itemList = Array(N + 1) { Item(0, 0) }
        
        for (i in 1..N) {
            val st =        StringTokenizer(readln())
            val weight =    st.nextToken().toInt()
            val value =     st.nextToken().toInt()
            
            val item =      Item(weight, value)
            itemList[i] = item
        }
    }
    
    fun getMaxSumOfItemValues(): Int {
        val dp = Array(itemList.size) { IntArray(weightLimit + 1) }
        
        // 입력 받은 아이템 전체 순회
        for (itemIndex in 1 ..numOfItems) {
            // 가능한 모든 무게 조합 순회
            for (sumOfWeights in 1..weightLimit) {
                val currentItem = itemList[itemIndex]
                
                if (currentItem.weight > sumOfWeights) {
                    // 순회 중인 무게가 현재 아이템 무게보다 적게 나갈 경우 저장된 이전 값을 그대로 가져옵니다.
                    dp[itemIndex][sumOfWeights] = dp[itemIndex - 1][sumOfWeights]
                } else {
                    // 그렇지 않을 경우 : 저장된 무게별 최대 가치 값에 현재 아이템 무게와 가치를 적용한 뒤
                    // 앞서 저장된 값과 max로 비교해 더 큰 값을 덮어씌웁니다.
                    val savedValueWithoutCurrentWeight = dp[itemIndex - 1][sumOfWeights - currentItem.weight]
                    val currentValue = currentItem.value + savedValueWithoutCurrentWeight
                    val prevValue = dp[itemIndex - 1][sumOfWeights]
                    
                    dp[itemIndex][sumOfWeights] = max(currentValue, prevValue)
                }
            }
        }
        
        return dp[numOfItems][weightLimit]
    }
    
    private data class Item(
        val weight: Int,
        val value:  Int,
    )
}