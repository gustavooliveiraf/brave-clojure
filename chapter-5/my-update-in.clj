(ns my-update-in)

;; 5. Implement update-in.
(defn my-update-in [m k & f]
  (reduce #(%2 %1) (get-in m k) f))

;; (defn update-in2
;;   ([m ks f & args]
;;    (let [up (fn up [m ks f args]
;;               (let [[k & ks] ks]
;;                 (if ks
;;                   (assoc m k (up (get m k) ks f args))
;;                   (assoc m k (apply f (get m k) args)))))]
;;      (up m ks f args))))
