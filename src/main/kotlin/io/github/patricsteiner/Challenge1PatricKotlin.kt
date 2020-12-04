package io.github.patricsteiner

import kotlin.math.pow
import kotlin.math.sqrt

class Challenge1PatricKotlin {

    /**
     * @param banks   List of bank coordinates in the form "x1,y1;x2,y2;x3,y3"
     * @param partner Partner coordinate in the form "x,y"
     * @return The zero-based index of the first bank closest to the partner (euclidean distance)
     */
    fun findClosestBank(banks: String, partner: String): Int {
        val banks = banks.split(";").map { it.split(",").map { it.toInt() } }
        val partner = partner.split(",").map { it.toInt() }
        var minIdx = -1
        var minDist = Double.MAX_VALUE
        banks.map { dist(partner[0], partner[1], it[0], it[1]) }.forEachIndexed { i, dist ->
            if (dist < minDist) {
                minIdx = i
                minDist = dist
            }
        }
        return minIdx
    }

    fun dist(x1: Int, y1: Int, x2: Int, y2: Int) = sqrt((x1 - x2).toDouble().pow(2) + (y1 - y2).toDouble().pow(2))

}
