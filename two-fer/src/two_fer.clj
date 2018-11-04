(ns two-fer)

(defn make-message [name]
  (str (str "One for " name) ", one for me."))

(defn two-fer 
  ([] (make-message "you")) 
  ([name] (make-message name))
)
