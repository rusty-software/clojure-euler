(defproject clojure-euler "0.1.0-SNAPSHOT"
  :description "Solutions to projecteuler.net problems, in clojure"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.11.0"]
                             [venantius/ultra "0.3.4"]]
                   :ultra {:color-scheme :solarized-dark }}}
  :test-selectors {:default (constantly true)
                   :single :single})
