package io.github.patricsteiner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class Challenge1PatricJava {

    /**
     * @param banks   List of bank coordinates in the form "x1,y1;x2,y2;x3,y3"
     * @param partner Partner coordinate in the form "x,y"
     * @return The index of the bank closest to the partner (euclidean distance)
     */
    int findClosestBank(String banks, String partner) {
        var partnerCoords = partner.split(",");
        var partnerX = parseInt(partnerCoords[0]);
        var partnerY = parseInt(partnerCoords[1]);
        var bankCoords = stream(banks.split(";")).map(coord -> coord.split(",")).collect(toList());

        var minDist = Double.MAX_VALUE;
        var idx = -1;
        for (var i = 0; i < bankCoords.size(); i++) {
            var dist = distance(partnerX, partnerY, parseInt(bankCoords.get(i)[0]), parseInt(bankCoords.get(i)[1]));
            if (dist < minDist) {
                minDist = dist;
                idx = i;
            }
        }
        System.out.println(minDist);
        return idx;
    }

    double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

}
