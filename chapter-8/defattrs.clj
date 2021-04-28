(ns defattrs)

(defmacro defattrs
  ([name value]
   `(def ~name (comp ~value :attributes)))
  ([name value & rest]
   `(do
      (defattrs ~name ~value)
      (defattrs ~@rest))))
