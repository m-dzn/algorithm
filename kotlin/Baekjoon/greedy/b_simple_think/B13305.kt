package Baekjoon.greedy.b_simple_think

import java.util.StringTokenizer

// 실버 III > 주유소
fun main() {
    val (numOfCities, distances, oilPrices) = B13305.getInputs()
    
    val minCostOfFuel = B13305.getMinCostOfFuel(numOfCities, oilPrices, distances)
    
    println(minCostOfFuel)
}

private object B13305 {
    fun getInputs(): Triple<Int, ArrayList<Int>, ArrayList<Int>> {
        val numOfCities = readln().toInt()
        val distances = getNumberListFromInput(readln())
        val oilPrices = getNumberListFromInput(readln())
        
        return Triple(numOfCities, distances, oilPrices)
    }
    
    private fun getNumberListFromInput(line: String): ArrayList<Int> {
        val st = StringTokenizer(line)
        
        val numberList = arrayListOf<Int>()
        while (st.hasMoreTokens()) {
            val number = st.nextToken().toInt()
            numberList.add(number)
        }
        
        return numberList
    }
    
    fun getMinCostOfFuel(numOfCities: Int, oilPrices: ArrayList<Int>, distances: ArrayList<Int>): Long {
        var totalFuelCost = 0L
        
        // 1. 지금까지 들른 도시들 중 가장 싼 기름 값이 얼마인지 비교 후 저장하기
        var cheapestOilPriceEver = Int.MAX_VALUE
        
        // 2. 가장 싼 기름값에 현재 거리를 곱해서 총 비용에 더하기
        for (cityIndex in 0 until numOfCities - 1) {
            val oilPrice = oilPrices[cityIndex]
            if (cheapestOilPriceEver > oilPrice) cheapestOilPriceEver = oilPrice
            
            totalFuelCost += cheapestOilPriceEver.toLong() * distances[cityIndex]
        }
        
        return totalFuelCost
    }
}