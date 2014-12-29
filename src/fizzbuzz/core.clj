(ns fizzbuzz.core)

(defn fizzbuzz [a]
  (cond
    (= (mod a 3) 0) "Fizz"
    (= (mod a 5) 0) "Buzz"
    :else a
  )
)
