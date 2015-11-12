(ns clojure-euler.helpers
  (require [clojure.string :as str]))

(defn fibonacci-seq
  "Returns sequence of fibonacci numbers below given value."
  ([n]
   (cond
     (= 0 n) [0]
     (= 1 n) [0]
     (= 2 n) [0 1]
     :else (fibonacci-seq n [0 1 2])))
  ([limit vals]
   (let [next-val (apply + (take-last 2 vals))]
     (if (>= next-val limit)
       vals
       (fibonacci-seq limit (conj vals next-val))))))

;; Taken from clojure.contrib.lazy-seqs
; primes cannot be written efficiently as a function, because
; it needs to look back on the whole sequence
(def primes
  (concat
   [2 3 5 7]
   (lazy-seq
    (let [primes-from
          (fn primes-from [n [f & r]]
            (if (some #(zero? (rem n %))
                      (take-while #(<= (* % %) n) primes))
              (recur (+ n f) r)
              (lazy-seq (cons n (primes-from (+ n f) r)))))
          wheel (cycle [2 4 2 4 6 2 6 4 2 4 6 6 2 6  4  2
                        6 4 6 8 4 2 4 2 4 8 6 4 6 2  4  6
                        2 6 6 4 2 4 6 2 6 4 2 4 2 10 2 10])]
      (primes-from 11 wheel)))))

(defn palindrome?
  "Returns true if number is palindromic, otherwise false."
  [n]
  (= (str n) (str/reverse (str n))))
