(ns land-price-analysis.core-test
  (:use midje.sweet)
  (:require [
   land-price-analysis.core :refer :all]
  ))

(facts "about first"
  (fact "it normally returns the first element"
    (first [1 2 3] ) => 1
    (first '(1 2 3)) => 1))
