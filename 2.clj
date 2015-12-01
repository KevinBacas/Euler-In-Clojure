(def fib (cons 1 (cons 1 (lazy-seq (map + fib (rest fib))))))

(defn isUnder4Million
  [x]
  (< x 4000000))

(reduce + (filter even? (filter isUnder4Million (take 50 fib))))
