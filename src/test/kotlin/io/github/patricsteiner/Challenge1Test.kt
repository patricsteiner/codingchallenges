package io.github.patricsteiner

import junit.framework.TestCase.assertEquals
import org.junit.Test
//import kotlin.test.Test
//import kotlin.test.assertEquals

class Challenge1Test {

    private var challenge1 = Challenge1()

    @Test
    fun test() {
        with(challenge1) {
            assertEquals(0, findClosestBank("1,1", "1,1"))
            assertEquals(0, findClosestBank("1,1;2,2", "1,2"))
            assertEquals(1, findClosestBank("1,1;2,2", "2,2"))
            assertEquals(2, findClosestBank("1,1;2,2;2,3", "3,3"))
            assertEquals(3, findClosestBank("-1,1;1,1;2,2;1,-3;2,1;0,1;0,2;1,0;2,-1", "1,-2"))
            assertEquals(7, findClosestBank("-32,-34;32,24;48,-39;21,24;-80,37;-99,49;38,-3;2,-1;84,54;45,-35", "0,0"))
            assertEquals(3, findClosestBank("17,93;79,60;52,24;58,-36;83,-80;1,-52;-7,64;-44,-61;-69,-43;62,-81;-77,-28;-46,-53;-1,-91;61,86;0,-96;-9,25;83,81;-8,-76;-40,-9;80,62", "34,-22"))
            assertEquals(27, findClosestBank("-31,12;97,-36;-92,-66;-64,-45;79,19;29,-65;46,-7;14,28;-13,86;-60,-50;-56,69;27,-90;95,32;-94,20;-96,29;-52,6;-35,-33;88,82;-77,50;63,-82;98,19;-59,63;-71,-83;-73,-3;-65,-70;18,20;26,-63;24,59;83,73;24,31;82,33;2,82;76,12;-57,48;-53,-78;-83,85;20,-28;-39,62;-68,-66;-17,-16;-61,-13;44,-64;24,57;87,35;97,-7;-54,-52;-57,31;54,67;92,51;-78,-38", "25,81"))
        }
    }

}
