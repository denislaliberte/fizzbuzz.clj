(ns fizzbuzz.core)

(defn fizzbuzz [a]
  (cond
    (= (mod a 15) 0) "FizzBuzz"
    (= (mod a 5) 0) "Buzz"
    (= (mod a 3) 0) "Fizz"
    :else a
  )
)
