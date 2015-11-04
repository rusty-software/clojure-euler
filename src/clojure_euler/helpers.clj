(ns clojure-euler.helpers)

(defn fibonacci-seq
  "Returns sequence of fibonacci numbers below given value."
  ([n]
   (cond
     (= 0 n) [0]
     (= 1 n) [0]
     (= 2 n) [0 1]
     :else (fibonacci-seq n [0 1 2])))
  ([limit vals]
   (if (>= (last vals) limit)
     (butlast vals)
     (fibonacci-seq limit (conj vals (+ (last vals) (first (take-last 2 vals))))))))
