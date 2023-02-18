package Baekjoon.bruteforce.c_light_logic

import java.util.*
import kotlin.math.abs

// 골드 V > 리모컨
fun main() {
    val targetChannel = readln().toInt()
    val M = readln().toInt()
    val nonWorkingButtons = if (M > 0)  readln().split(' ').map { it.toInt() }
                            else        emptyList()
    
    val tvRemote = TVRemote(100)
    nonWorkingButtons.forEach(tvRemote::disableButton)
    
    val minButtonHits = tvRemote.estimateMinButtonHits(targetChannel)
    
    println(minButtonHits)
}

private class TVRemote(val currentChannel: Int) {
    companion object {
        val NUMBER_BUTTON_ARRAY = IntArray(10) { it }
    }
    
    val buttonSet: HashSet<Int> = NUMBER_BUTTON_ARRAY.toHashSet()
    
    fun disableButton(button: Int) {
        buttonSet.remove(button)
    }
    
    fun estimateMinButtonHits(targetChannel: Int): Int {
        var minHitCount = Int.MAX_VALUE
        
        val channelDiffFromCurrent = abs(targetChannel - currentChannel)
        if (buttonSet.size == 0) return channelDiffFromCurrent
        
        if (buttonSet.contains(0)) {
            minHitCount = minHitCount.coerceAtMost(targetChannel + 1)
        }
        
        for (channel in 1..1000000) {
            var tempChannel = channel
            var skip = false
            var hitCount = 0
            
            while (tempChannel > 0) {
                if (!buttonSet.contains(tempChannel % 10)) {
                    skip = true
                    break
                }
                hitCount++
                tempChannel /= 10
            }
            
            if (skip) continue
            
            val diff = abs(targetChannel - channel)
            hitCount += diff
            minHitCount = minHitCount.coerceAtMost(hitCount)
        }
        
        return minHitCount.coerceAtMost(channelDiffFromCurrent)
    }
}