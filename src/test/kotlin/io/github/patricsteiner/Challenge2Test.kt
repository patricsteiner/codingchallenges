package io.github.patricsteiner

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertNull
import org.junit.Test


class Challenge2Test {

    private var challenge2 = Challenge2()

    @Test
    fun test() {
        with(challenge2) {
            assertNull(splitSum(1, intArrayOf(1, 2)))
            assertNull(splitSum(2, intArrayOf(1, 2)))
            assertArrayEquals(intArrayOf(1, 2), splitSum(3, intArrayOf(1, 2)))
            assertArrayEquals(intArrayOf(2, 1), splitSum(3, intArrayOf(2, 1)))
            assertArrayEquals(intArrayOf(1, 2), splitSum(3, intArrayOf(1, 2, 3)))
            assertArrayEquals(intArrayOf(2, 1), splitSum(3, intArrayOf(0, 5, 2, 1, 3)))
            assertArrayEquals(intArrayOf(8, 15), splitSum(23, intArrayOf(3, 8, 33, 14, 15, 20)))
            assertArrayEquals(intArrayOf(9, 14), splitSum(23, intArrayOf(3, 9, 33, 14, 15, 20)))
            assertArrayEquals(intArrayOf(3, 20), splitSum(23, intArrayOf(3, 10, 33, 14, 15, 20)))
            assertArrayEquals(intArrayOf(10, 5), splitSum(15, intArrayOf(1, 10, 4, 5, 2, 324, 23, 34)))
            assertArrayEquals(intArrayOf(111, 222), splitSum(333, intArrayOf(1, 10, 4, 5, 111, 2, 324, 23, 222, 34)))
            assertArrayEquals(intArrayOf(234, 12), splitSum(246, intArrayOf(987, 34, 3, 2, 43, 5, 623, 1, 29, 234, 4, 543, 34, 66, 12, 309, 235, 6)))
        }
    }

}
