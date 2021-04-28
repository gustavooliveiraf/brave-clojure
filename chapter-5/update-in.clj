(ns update-in)

;; 4. Look up and use the update-in function.
(def users [{:name "James" :age 26}  {:name "John" :age 43}])
(update-in users [1 :age] inc)
;;=> [{:name "James", :age 26} {:name "John", :age 44}]

(def p {:name "James" :age 26})
(update-in p [:age] inc)
;;=> {:name "James", :age 27}
(update-in p [:age] + 10)
;;=> {:name "James", :age 36}

(update-in {:a 3} [:a] / 4 5)
;;=> {:a 3/20}

(update-in [1 2 [1 2 3]] [2 0] inc)
;;=> [1 2 [2 2 3]]
