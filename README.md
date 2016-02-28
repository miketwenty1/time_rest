# time_retrieval

Simple clojure app on your localhost.  Made a landing HTML5 page that is pretty bare. 
This is using a simple rest GET call which can be seen if you inspect the header element on the network tab of firefox or chrome.  
After starting the webserver you can go here:
"http://localhost:3000" just a landing page
"http://localhost:3000/time"  then you will see the generic java.util.Date string.
"http://localhost:3000/time_of_day" then you will see the time of day
## Usage
Type this cmd in:
lein ring server 3000

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
