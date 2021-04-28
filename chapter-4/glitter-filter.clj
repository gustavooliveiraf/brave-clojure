(ns glitter-filter)

;; 1. Turn the result of your glitter filter into a list of names.
(defn glitter-filter
  [minimum-glitter records]
  (map :name (filter #(>= (:glitter-index %) minimum-glitter) records)))
