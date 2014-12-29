(ns fizzbuzz.core)

(defn isMod "Test if the module of the first parameter by the second return 0" [a b ]
  (= (mod a b) 0)
)

(defn fizzbuzz "Calculate the fizz or buzz of a number" [a]
  (cond
    (isMod a 15) "FizzBuzz"
    (isMod a 5) "Buzz"
    (isMod a 3) "Fizz"
    :else a
  )
)

(defn fizzbuzzlist "return a list of fizz buzz from 1 to the max number" [max]
  (map fizzbuzz (range 1 (inc max)))
)
