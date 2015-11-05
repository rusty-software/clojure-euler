(ns clojure-euler.core-test
  (:require [clojure.test :refer :all]
            [clojure-euler.core :refer :all]))

(deftest problem-001-tests
  (testing "multiples of 3 and 5"
    (is (= 23 (problem-001 10)))
    (is (= 233168 (problem-001 1000)))))

(deftest problem-002-tests
  (testing "even fibonacci numbers"
    (is (= (+ 2 8 34) (problem-002 100)))
    (is (= 4613732 (problem-002 4000000)))))
