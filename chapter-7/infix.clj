(ns infix)

;; 2. Create an infix function that takes a list like (1 + 3 * 4 - 5) and transforms it into the lists that Clojure needs in order to correctly evaluate the expression using operator precedence rules.
(def operator-precedence {'* 1 '/ 1 '+ 0 '- 0})

(defn prefix-build [head prefix]
  (cons (list head (first prefix) (second prefix)) (drop 2 prefix)))

(defn infix [lst] 
  (loop [opt-stack '()
         prefix '()
         token-list lst]
    (if (empty? token-list)
      (first (reduce #(prefix-build %2 %1) prefix opt-stack))
      (let [[head-token-list & tail-token-list] token-list
            [head-opt-stack & tail-opt-stack] opt-stack]
           (cond
             (number? head-token-list) (recur opt-stack (cons head-token-list prefix) tail-token-list)
             (or (empty? opt-stack) (> (operator-precedence head-token-list) (operator-precedence (first opt-stack))))
               (recur (cons head-token-list opt-stack) prefix tail-token-list)
             :else (recur tail-opt-stack (prefix-build head-opt-stack prefix) token-list))))))
