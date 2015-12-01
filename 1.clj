; Définition du tableau des 1000 premiers entiers naturels
(def xs (int-array (range 1000)))

; Définition d'une fonction qui renvoie vrai si l'entier est divisible par 3 ou 5
(defn isMultipleFiveThree
  [x]
  (or (integer? (/ x 5)) (integer? (/ x 3))))

; Fonction qui va sommer une liste d'entiers divisible par 3 ou 5
(defn customSum
  [x]
  (reduce + (filter isMultipleFiveThree x)))

; Appel de la fonction
(customSum xs)
