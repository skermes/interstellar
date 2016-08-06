(defproject interstellar "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [twitter-api "0.7.8"]
                 [yesql "0.5.3"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 [compojure "1.5.1"]
                 [hiccup "1.0.5"]
                 [ring/ring-defaults "0.2.1"]
                 [logback-bundle/core-bundle "0.2.2"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler interstellar.web/app})
