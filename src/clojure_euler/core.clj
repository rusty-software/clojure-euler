(ns clojure-euler.core
  (require [clojure-euler.helpers :as helpers]))

(defn problem-001
  "Returns sum of all multiples of 3 or 5 below arg value."
  [n]
  (letfn [(sum-when-appropriate [sum i]
            (if (or (zero? (mod i 3)) (zero? (mod i 5)))
              (+ sum i)
              sum))]
    (reduce sum-when-appropriate (range n))))

(defn problem-002
  "Returns sum of even fibonacci numbers below arg value."
  [n]
  (apply + (filter even? (helpers/fibonacci-seq n))))
