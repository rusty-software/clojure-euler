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
  (let [largest (inc (read-string (apply str (repeat num-digits "9"))))
        smallest (inc (read-string (apply str (repeat (dec num-digits) "9"))))
        products (for [n1 (range smallest largest)
                       n2 (range smallest largest)]
                   (* n1 n2))
        palindromes (filter helpers/palindrome? products)]
    (apply max palindromes)))

(defn problem-005
  "Returns the smallest positive number that can be evenly divided by each whole number in the range ending with a given value."
  [n]
  (loop [candidate n]
    (if (every? true? (map #(helpers/factor-of? candidate %) (range 2 (inc n))))
      candidate
      (recur (+ candidate n)))))

(defn problem-006
  "Returns the difference between the sum of the squares and the square of the sum for the integer range below a given value."
  [n]
  (let [square (fn [i] (* i i))
        sum-of-squares (apply + (map square (range (inc n))))
        square-of-sums (square (apply + (range (inc n))))]
    (- square-of-sums sum-of-squares)))

(defn problem-007
  "Returns the nth prime number"
  [n]
  (nth helpers/primes (dec n)))