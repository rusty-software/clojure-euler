(ns clojure-euler.core-test
  (:require [clojure.test :refer :all]
            [clojure-euler.core :refer :all]))

(deftest problem-001-test
  (testing "multiples of 3 and 5"
    (is (= 23 (problem-001 10)))
    (is (= 233168 (problem-001 1000)))))

(deftest problem-002-test
  (testing "even fibonacci numbers"
    (is (= (+ 2 8 34) (problem-002 100)))
    (is (= 4613732 (problem-002 4000000)))))

(deftest problem-003-test
  (testing "largest prime factor"
    (is (= 29 (problem-003 13195)))
    (is (= 6857 (problem-003 600851475143)))))

(deftest problem-004-test
  (testing "Largest palindrome product"
    (is (= 9009 (problem-004 2)))
    (is (= 906609 (problem-004 3)))))

(deftest problem-005-test
  (testing "Smallest multiple"
    (is (= 2520 (problem-005 10)))
    (is (= 232792560 (problem-005 20)))))

(deftest problem-006-test
  (testing "Sum square difference"
    (is (= 2640 (problem-006 10)))
    (is (= 25164150 (problem-006 100)))))

(deftest problem-007-test
  (testing "10001st prime number"
    (is (= 13 (problem-007 6)))
    (is (= 104743 (problem-007 10001)))))