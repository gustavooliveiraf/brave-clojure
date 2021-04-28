(ns my-comp)

;; 2. Implement the comp function.
(defn my-comp [& k]
  (fn [x]
    (reduce #(%2 %1) x (reverse k))))

;; (defn attr [attribute]
;;   ((my-comp attribute :attributes) character))