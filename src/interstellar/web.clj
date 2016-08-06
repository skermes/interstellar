(ns interstellar.web
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]

            [interstellar.templates :as t]
            [interstellar.db :as db]))

(defroutes app-routes
  (GET "/" [] "Hello, void of interstellar space")
  (GET "/admin" [] (t/page (t/admin-page (db/services))))
  (route/resources "/")
  (route/not-found "The vastness between the stars is empty and cold"))

(def app
  (wrap-defaults app-routes site-defaults))
