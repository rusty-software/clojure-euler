(ns clojure-euler.core)

(defn problem-001
  "Returns sum of all multiples of 3 or 5 below arg value."
  [n]
  (letfn [(sum-when-appropriate [sum i]
            (if (or (zero? (mod i 3)) (zero? (mod i 5)))
              (+ sum i)
              sum))]
    (reduce sum-when-appropriate (range n))))
