(ns dec-maker)

;; 3. Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction.
(defn dec-maker
  "Create a custom incrementor"
  [dec-by]
  #(- % dec-by))

(def dec9 (dec-maker 9))

(dec 10)
