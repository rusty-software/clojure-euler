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
  (let [limit (long (Math/sqrt n))
        factor-of? (fn [i] (zero? (mod n i)))
        new-factors (fn [factors i]
                      (if (factor-of? i)
                        (conj factors i)
                        factors))
        prime-factors (loop [current-factors []
                             primes helpers/primes]
                        (let [candidate (first primes)]
                          (if (> candidate limit)
                            current-factors
                            (recur (new-factors current-factors candidate) (rest primes)))))]
    (last prime-factors)))

(defn problem-004
  "Returns the largest palindromic product of two numbers of a given number of digits."
  [num-digits]
  nil)
