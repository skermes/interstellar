(ns interstellar.web
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Hello, void of interstellar space")
  (route/not-found "The vastness between the stars is empty and cold"))

(def app
  (wrap-defaults app-routes site-defaults))
