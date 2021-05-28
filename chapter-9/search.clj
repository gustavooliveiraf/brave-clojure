;; Write a function that takes a string as an argument and searches for it on Bing and Google using the slurp function. Your function should return the HTML of the first page returned by the search.
(def prefix-url "https://")
(def sufix-url "/search?q=")
(def bing-domain-url "bing.com")
(def google-domain-url "google.com")

(defn search-google [string]
  (slurp (str prefix-url google-domain-url sufix-url string)))

(defn search-bing [string]
  (slurp (str prefix-url bing-domain-url sufix-url string)))

(defn search [string-to-search]
  (let [search-promise (promise)]
    (doseq [search-site [search-bing search-google]]
      (future (deliver search-promise (search-site string-to-search))))
    (deref search-promise 2000 "Timed out")))

(search "casa")
