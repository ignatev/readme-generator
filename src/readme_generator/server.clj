(ns readme-generator.server
  (:require [compojure.core :refer [defroutes GET]]
            [ring.adapter.jetty :as ring]))
(defroutes routes
  (GET "/" [] "<h2>It works!</h2>"))

(defn -main []
  (ring/run-jetty #'routes {:port 3000 :join? false}))
