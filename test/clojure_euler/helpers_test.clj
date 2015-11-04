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
