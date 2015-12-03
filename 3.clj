(defn isPrimeNumber
  [n]
  (not (some (fn [l] (integer? (/ n l))) (range 2 n))))

(isPrimeNumber 3)
(isPrimeNumber 6)
(isPrimeNumber 600851475143)

(filter isPrimeNumber (range 2 600851475143))

(defn listPrimeFactors
  [n]
  (filter integer?
    (for [x
      (filter isPrimeNumber
        (range 2 n))]
      (if (integer? (/ n x))
        x)
      )))

(listPrimeFactors 13195)
