(defproject clojure-euler "0.1.0-SNAPSHOT"
  :description "Solutions to projecteuler.net problems, in clojure"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.11.0"]
                             [venantius/ultra "0.3.4"]]
                   :ultra {:color-scheme :default }}}
  :test-selectors {:default (constantly true)
                   :single :single})
