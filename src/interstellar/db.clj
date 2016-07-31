(ns interstellar.db
  (:require [yesql.core :as yes]))

;; Replace this with environment vars when I get it working.
(def db-spec {:classname "org.postgresql.Driver"
              :subprotocol "postgresql"
              :subname "//localhost:5432/interstellar"
              :user "skermes"})

(def schema-queries
  (yes/defqueries "queries/schema.sql" {:connection db-spec}))

(defn create-database! []
  (doseq [query schema-queries]
    (query)))
