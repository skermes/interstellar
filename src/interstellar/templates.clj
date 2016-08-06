(ns interstellar.templates
  (:require [hiccup.page :refer [html5 include-css]]))

(defn page [& contents]
  (html5
    [:html
      [:head
        [:title "Interstellar"]
        [:meta {:name "viewport"
                :content "width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, minimal-ui"}]
        (include-css "interstellar.css")]
      [:body
        contents]]))

(defn service-section [service]
  [:h3 (:name service)])

(defn admin-page [services]
  (map service-section services))