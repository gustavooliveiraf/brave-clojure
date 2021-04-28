(ns attr)

(def character
  {:name "Smooches McCutes"
   "teste" "muito loko"
   :attributes {:intelligence 10
                :strength 4
                :dexterity 5}})

(def c-int (comp :intelligence :attributes))
(c-int character)

;; 1. You used (comp :intelligence :attributes) to create a function that returns a character’s intelligence. Create a new function, attr, that you can call like (attr :intelligence) and that does the same thing.
(defn attr [attribute]
  ((comp attribute :attributes) character))
