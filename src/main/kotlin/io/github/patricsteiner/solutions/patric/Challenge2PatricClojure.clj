;; disclaimer: am clojure noob, this is a bad solution

(defn splitSum [sum allObjektArts]
        (filter (fn [s] (= sum (+ (first s) (second s))))
                (for [a allObjektArts b allObjektArts] [a b])))

        (println (splitSum 23 [3, 8, 33, 14, 15, 20]))
