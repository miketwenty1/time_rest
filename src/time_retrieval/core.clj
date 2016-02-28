(ns time_retrieval.core
  (:use compojure.core
  		ring.middleware.json
  		ring.util.response)
  (:require [compojure.route :as route]
  	        [time_retrieval.view :as view]))


(defn foo [x] (str "Hello, " x))
;;(defn timetest [] (new java.util.Date.))
(defn now [] (str(new java.util.Date)))
(def date (java.util.Date.))
(defn now_time [] (.format (java.text.SimpleDateFormat. "HH:mm:ss") date)) 

(defroutes my_routes
  (GET "/" [] (view/index-page))
  (GET "/time" [] (response {:time_test (now)}))
  (GET "/time_of_day" [] (response {:time_of_day (now_time)}))
  (route/resources "/"))

(def app (wrap-json-response my_routes))