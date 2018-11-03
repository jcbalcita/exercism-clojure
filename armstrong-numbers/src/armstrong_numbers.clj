(ns armstrong-numbers)

(require '[clojure.string :as str])

(defn find-len [num]
  (count (str/split (str num) #"")))

(defn exp [x n]
  (reduce * (repeat n x)))

(defn armstrong? [num]
  (def l (find-len num))
  (= num (reduce + (map (fn [x] (exp x l)) (map read-string (str/split (str num) #""))))))

