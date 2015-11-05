(ns clojure-euler.core
  (require [clojure-euler.helpers :as helpers]))

(defn problem-001
  "Returns sum of all multiples of 3 or 5 below a number."
  [n]
  (letfn [(sum-when-appropriate [sum i]
            (if (or (zero? (mod i 3)) (zero? (mod i 5)))
              (+ sum i)
              sum))]
    (reduce sum-when-appropriate (range n))))

(defn problem-002
  "Returns sum of even fibonacci numbers below a number."
  [n]
  (apply + (filter even? (helpers/fibonacci-seq n))))

(defn problem-003
  "Returns the largest prime factor of a number."
  [n]
  (last (filter helpers/prime? (helpers/factor-seq n))))
