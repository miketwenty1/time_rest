(ns time_retrieval.core
  (:use compojure.core
  		ring.middleware.json
  		ring.util.response)
  (:require [compojure.route :as route]
  	        [time_retrieval.view :as view]))


(defn foo [x] (str "Hello, " x))
;;(defn timetest [] (new java.util.Date.))
(defn now [] (str(new java.util.Date)))
(defroutes my_routes
  (GET "/" [] (view/index-page))
  (GET "/time" [] (response {:time_test (now)}))
  (route/resources "/"))

(def app (wrap-json-response my_routes))