;; 3. Implement the assoc-in function.
(defn my-assoc-in [m k v]
  (reduce #(assoc m %2 %1) v (reverse k)))

;; (defn my-assoc-in2 [m [k & ks] v]
;;   (if ks
;;     (assoc m k (my-assoc-in2 (get m k) ks v))
;;     (assoc m k v)))