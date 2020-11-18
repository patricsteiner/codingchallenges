package io.github.patricsteiner;

/**
 * Topic: Raiffeisen Lead Vermittlung
 * Für einen gegebenen Mobiliar Partner wollen wir die näheste Raiffeisen Filiale zu seinem Wohnort finden, um ihn dorthin vermitteln zu können.
 *
 * Gegeben:
 * Von der Raiffeisen API erhalten wir eine Liste von Koordinaten aller Raiffeisen Filialen in der Schweiz.
 * Die Raiffeisen API ist aber leider nicht optimal an unsere Bedürfnisse zugeschnitten. Wir erhalten alle Koordinaten in
 * einem einzigen langen Semikolon-separierten String, wobei die x und y Koordinate jeweils Komma-separiert sind.
 * Beispiel - folgender String enthält drei Koordinaten, die jeweils aus einer x und einer y Komponente bestehen: "1,3;-2,4;5,-1"
 * Der Wohnort des Partners steht ebenfalls als Koordinate in einem String zur Verfügung, z.B: "23,50"
 *
 * Gesucht:
 * Nun ist das Ziel, anhand des Wohnorts des Mobiliar Partners herauszufinden, welches die nahestgelegene Raiffeisen Filiale ist.
 * Gesucht ist der Null-basierte Index der nahsten Koordinate in der Semikolon-separierten Liste.
 *
 * Koordinaten sind immer ganze Zahlen im Intervall [-100, 100].
 * Es kann davon ausgegangen werden, dass Inputs immer gültig und korrekt formatiert sind.
 */
public class Challenge1 {

    /**
     * @param banks   List of bank coordinates in the form "x1,y1;x2,y2;x3,y3"
     * @param partner Partner coordinate in the form "x,y"
     * @return The zero-based index of the first bank closest to the partner (euclidean distance)
     */
    int findClosestBank(String banks, String partner) {
        return 0; // TODO your code here :)
    }

}
