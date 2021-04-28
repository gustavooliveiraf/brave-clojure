(ns append)

;; 2. Write a function, append, which will append a new suspect to your list of suspects.
(defn append
  [suspect records]
  (conj records suspect))
