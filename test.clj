
(defn delayed-print [ms text]
  (Thread/sleep ms)
  (println text))

(.start (Thread. #(delayed-print 1000 " World")))
(.start (Thread. #(delayed-print 1000 " World")))
(print "Hello")