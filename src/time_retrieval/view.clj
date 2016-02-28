(ns time_retrieval.view
	(:use hiccup.page hiccup.element))

(defn index-page [] 
	(html5
	[:html
	 [:head]
	 [:body "test html5 page</br>.. go to 'http://localhost:3000/time_of_day'</br>this should show the time"]]))