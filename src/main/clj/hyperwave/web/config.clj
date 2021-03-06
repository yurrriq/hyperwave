(ns hyperwave.web.config)

(def ^:dynamic *redis-conn* nil)
(def ^:dynamic *jetty-conn* nil)

(def ^:dynamic *insert-rate* nil)
(def ^:dynamic *head-rate* nil)
(def ^:dynamic *read-rate* nil)
(def ^:dynamic *tfail-rate* nil)

(defonce last-sample
  (atom nil))
