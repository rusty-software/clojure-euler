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
   (let [next-val (apply + (take-last 2 vals))]
     (if (>= next-val limit)
       vals
       (fibonacci-seq limit (conj vals next-val))))))

(defn prime?
  "Returns true if the number is prime, otherwise false."
  [n]
  (and (> n 1)
       (not (some #(zero? (mod n %)) (range 2 n)))))

(defn factor-seq
  "Returns sequence of factors of a number."
  [n]
  (letfn [(factor-acc [acc i]
            (if (zero? (mod n i))
              (conj acc i)
              acc))]
    (reduce factor-acc [] (range 1 (inc n)))))

