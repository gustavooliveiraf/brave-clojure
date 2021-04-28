(ns to-csv)

;; 4. Write a function that will take your list of maps and convert it back to a CSV string. You’ll need to use the clojure.string/join function.
(defn to-csv
  [records]
  (clojure.string/join "\n"
                       (map #(clojure.string/join "," %)
                            (map #(vector (:name %) (:glitter-index %)) records))))
