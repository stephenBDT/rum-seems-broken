(ns use-clj.core
  (:require [rum.core :as rum]))

(rum/defc test-comp [a]
  [:h1 a])

(def hello-from-rum (rum/render-html (test-comp "Hello from Rum")))

(defn -main []
  (println hello-from-rum))
