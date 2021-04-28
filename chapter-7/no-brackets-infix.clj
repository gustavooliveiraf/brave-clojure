(ns no-brackets-infix)

(def operator-precedence {'* 1 '/ 1 '+ 0 '- 0})

(defn infix [lst]
  (loop [opt-stack '()
         prefix '()
         token-list lst]
    (if (empty? token-list)
      (concat (reverse opt-stack) prefix)
      (let [[head-token-list & tail-token-list] token-list
            [head-opt-stack & tail-opt-stack] opt-stack]
        (cond
          (number? head-token-list) (recur opt-stack (cons head-token-list prefix) tail-token-list)
          (or (empty? opt-stack) (> (operator-precedence head-token-list) (operator-precedence (first opt-stack)))) (recur (cons head-token-list opt-stack) prefix tail-token-list)
          :else (recur tail-opt-stack (cons head-opt-stack prefix) token-list))))))
