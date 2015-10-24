(ns com.mycompany.app.core
  (:gen-class)
  (:use (incanter core stats charts)))

(defn -main [& args]
  (println "Hello Clojure!")
  (println "Java main called clojure function with args: "
           (apply str (interpose " " args))))


(defn run []
  (view (histogram (sample-normal 1000))))
