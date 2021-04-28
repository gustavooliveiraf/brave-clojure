(ns anotations)

(clojure.core/refer-clojure)
(in-ns 'cheese.taxonomy)

(clojure.core/refer 'cheese.taxonomy :only ['bries])
(clojure.core/refer 'cheese.taxonomy :exclude ['bries])
(clojure.core/refer 'cheese.taxonomy :rename {'bries 'yummy-bries})

;; Clojure expects the file to declare a namespace corresponding to its path (which ours does).

;; (require 'the-divine-cheese-code.visualization.svg)
;; (refer 'the-divine-cheese-code.visualization.svg)

;; is equivalent to this:

;; (use 'the-divine-cheese-code.visualization.svg)
