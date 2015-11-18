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

(deftest problem-003-tests
  (testing "largest prime factor"
    (is (= 29 (problem-003 13195)))
    (is (= 6857 (problem-003 600851475143)))))

(deftest problem-004-tests
  (testing "Largest palindrome product"
    (is (= 9009 (problem-004 2)))
    (is (= 906609 (problem-004 3)))))

(deftest problem-005-tests
  (testing "Smallest multiple"
    (is (= 2520 (problem-005 10)))
    (is (= 232792560 (problem-005 20)))))

(deftest problem-006-tests
  (testing "Sum square difference"
    (is (= 2640 (problem-006 10)))
    (is (= 25164150 (problem-006 100)))))