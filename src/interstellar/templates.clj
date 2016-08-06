(ns interstellar.templates
  (:require [hiccup.page :refer [html5 include-css]]
            [clojure.string :as s]))

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

(def title
  [:h1.title "Interstellar"])

(defn service-section [service]
  [:div.section-header
    [:img.service-logo {:src (:logo service)}]
  [:h3 (:name service)]])

(defn admin-page [services]
  (list
    title
    (map service-section services)))