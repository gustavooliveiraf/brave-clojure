(ns prints-name)

;; 1. Use the list function, quoting, and read-string to create a list that, when evaluated, prints your first name and your favorite sci-fi movie.
(eval (list (read-string "println") "Gustavo, Into the Wild"))