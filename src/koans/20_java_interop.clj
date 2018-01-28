(ns koans.20-java-interop
  (:require [koan-engine.core :refer :all]))

(meditations
  (= java.lang.String (class "warfare")) ; hint: try typing (javadoc "warfare") in the REPL
  "You may have done more with Java than you know"

  "The dot signifies easy and direct Java interoperation"
  (= "SELECT * FROM" (.toUpperCase "select * from"))

  "But instance method calls are very different from normal functions"
  (= ["SELECT" "FROM" "WHERE"] (map  ["select" "from" "where"]))

  "Constructing might be harder than breaking"
  (= 10 (let [latch (java.util.concurrent.CountDownLatch. __)]
          (.getCount latch)))

  "Static methods are slashing prices!"
  (== __ (Math/pow 2 10)))
