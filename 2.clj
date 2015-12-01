; Fibonaci definition
(def fib (cons 1 (cons 1 (lazy-seq (map + fib (rest fib))))))

; Return true if number is under 4m
(defn isUnder4Million
  [x]
  (< x 4000000))

; Calculating sum for of even fibonacci number under 4m
(reduce + (filter even? (filter isUnder4Million (take 50 fib))))
