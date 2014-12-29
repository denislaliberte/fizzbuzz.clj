(ns fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz.core :refer :all]))

(describe "Fizzbuzz"
  (it "I return 1 when the input is 1 "
    (should= 1 (fizzbuzz 1))))
