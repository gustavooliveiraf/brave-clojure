(ns 4-mapset)

;; 4. Write a function, mapset, that works like map except the return value is a set.
(defn mapset [x] (set (map inc x)))

(mapset '(1 1 2 2))
