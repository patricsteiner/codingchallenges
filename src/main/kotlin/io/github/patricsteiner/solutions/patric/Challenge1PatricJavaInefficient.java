package io.github.patricsteiner.solutions.patric;

import java.util.AbstractMap.SimpleEntry;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Challenge1PatricJavaInefficient {

    /**
     * @param banks   List of bank coordinates in the form "x1,y1;x2,y2;x3,y3"
     * @param partner Partner coordinate in the form "x,y"
     * @return The index of the bank closest to the partner (euclidean distance)
     *
     * --> n * log(n) + c
     */
    int findClosestBank(String banks, String partner) {
        var partnerCoords = partner.split(",");
        var partnerX = parseInt(partnerCoords[0]);
        var partnerY = parseInt(partnerCoords[1]);
        var banksArr = banks.split(";");
        return IntStream.range(0, banksArr.length) // Because Java does not have a mapIndexed function...
                .mapToObj(i -> new SimpleEntry<>(i, banksArr[i].split(",")))
                .map(entry -> new SimpleEntry<>(entry.getKey(), distance(partnerX, partnerY, parseInt(entry.getValue()[0]), parseInt(entry.getValue()[1]))))
                .sorted((a, b) -> (int) (a.getValue() * 10000 - b.getValue() * 10000)) // Cannot compare doubles AND reverse, therefore hack by multiplying by 10000
                .map(SimpleEntry::getKey)
                .findFirst() // Java should have a findLast()...
                .get();
    }

    double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

}
