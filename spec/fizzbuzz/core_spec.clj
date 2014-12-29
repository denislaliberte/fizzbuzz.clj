(ns fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz.core :refer :all]))

(describe "Fizzbuzz"
  (it "I return 1 when the input is 1 "
    (should= 1 (fizzbuzz 1)))
  (it "I return Fizz when the input is a multiple of 3 "
    (should= "Fizz" (fizzbuzz 3))
    (should= "Fizz" (fizzbuzz 6))
  )
  (it "I return Buzz when the input is a multiple of 5 "
    (should= "Buzz" (fizzbuzz 5))
    (should= "Buzz" (fizzbuzz 10))
  )
  (it "I return FizzBuzz when the input is a multiple of 5 and 3 "
    (should= "FizzBuzz" (fizzbuzz 15))
  )
)
