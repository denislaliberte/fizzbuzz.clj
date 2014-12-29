(ns fizzbuzz.core)

(defn fizzbuzz [a]
  (if(= (mod a 3) 0) 
    "Fizz" 
    a
  )
)
