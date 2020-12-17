package io.github.patricsteiner;

/**
 * Topic: Summierte FDT ObjektArten
 * Der Aro-Verlauf Service liefert Verlaufeinträge für Useraktionen auf dem B2E Portal.
 * Jeder Eintrag hat eine FDT Objektart (ein Integer, quasi eine Art Mobi-weite Konstante für FachDatenTypen).
 * Anhand dieser Objektart kann man dann herausfinden, welche Art von "Businessobjekt" (z.B. Partner, Fall, Vertrag usw.)
 * mit diesem Verlaufeintrag zusammenhängt.
 * Leider kann es zu Szenarien kommen, wo 2 dicht aufeinanderfolgende Useraktionen als eine einziger Verlaufeinträg zusammengefasst werden.
 * In so einem Szenario wird die Objektart der beiden Aktionen zusammenaddiert und die Summe der ObjektArten in den Verlaufeintrag geschrieben.
 * (Das ist natürlich ein hypotetisches Szenario, Team Basejump hat das zum Glück nicht so implementiert.)
 *
 * Gegeben:
 * - Eine Summe von zwei FDT ObjektArten, z.B. 23
 * - Die Liste von allen möglichen FDT ObjektArten, z.B. [3, 8, 14, 15, 33]
 *
 * Gesucht:
 * Die zwei ursprünglichen ObjektArten (also die zwei Summanden) als Liste.
 *
 * Alle Zahlen sind immer positiv.
 * Wenn es mehrere Lösungen gibt, dann soll immer die Lösung zurückgegeben werden, die am vordersten ist (also die, wo der zweite Summand den kleinsten Index im Array hat).
 * Wenn es keine Lösung gibt, dann soll null zurückgegeben werden.
 *
 * Beispiel:
 * sum = 23
 * allObjektArts = [3, 8, 33, 14, 15, 20]
 * Gesuchte 2 ObjektArten: [8, 15]
 * Hier gibt es 2 mögliche Lösungen, 3+20 und 8+15. Letztere ist die gesuchte, da sich das Paar weiter vorne in der Liste befindet.
 */
public class Challenge2 {

    /**
     * @param sum           Sum of 2 FDT ObjektArts, e.g. 23
     * @param allObjektArts Array of all possible FDT ObjektArts, e.g. [3, 8, 14, 15, 33]
     * @return An array with the two original ObjektArts, that equal to the sum when added.
     */
    int[] splitSum(int sum, int[] allObjektArts) {
        return null; // TODO your code here :)
    }

}
