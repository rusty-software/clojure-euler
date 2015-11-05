(ns clojure-euler.helpers-test
  (:require [clojure.test :refer :all]
            [clojure-euler.helpers :refer :all]))

(deftest fibonacci-seq-tests
  (is (= [0] (fibonacci-seq 0)))
  (is (= [0] (fibonacci-seq 1)))
  (is (= [0 1] (fibonacci-seq 2)))
  (is (= [0 1 2] (fibonacci-seq 3)))
  (is (= [0 1 2 3] (fibonacci-seq 5)))
  (is (= [0 1 2 3 5 8] (fibonacci-seq 10)))
  (is (= [0 1 2 3 5 8 13 21 34 55 89] (fibonacci-seq 100))))

(deftest prime?-tests
  (testing "primes are prime"
    (let [primes [2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97]]
      (for [n primes]
        (is (prime? n)))))
  (testing "non-primes are not prime"
    (let [non-primes [1 4 8 9 15 21 27 49 87]]
      (for [n non-primes]
        (is (not (prime? n)))))))

(deftest factor-seq-tests
  (is (= [1 3 9 27] (factor-seq 27))))

