(ns fizzbuzz.core)

(defn isMod [a b ]
  (= (mod a b) 0)
)

(defn fizzbuzz [a]
  (cond
    (isMod a 15) "FizzBuzz"
    (isMod a 5) "Buzz"
    (isMod a 3) "Fizz"
    :else a
  )
)
