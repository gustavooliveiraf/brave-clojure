;; Update your function so it takes a second argument consisting of the search engines to use.
(def prefix-url "https://")
(def sufix-url "/search?q=")
(def bing-domain-url "bing.com")
(def google-domain-url "google.com")

(defn search-google [string]
  (slurp (str prefix-url google-domain-url sufix-url string)))

(defn search-bing [string]
  (slurp (str prefix-url bing-domain-url sufix-url string)))

(def map-engine {"google" search-google "bing" search-bing})

(defn search-2 [string-to-search engine]
  (let [search-promise (promise)]
    (doseq [search-site [(map-engine engine)]]
      (future (deliver search-promise (search-site string-to-search))))
    (deref search-promise 2000 "Timed out")))

(search-2 "casa" "bing")
(search-2 "casa" "google")
