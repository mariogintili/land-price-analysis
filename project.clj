(defproject land-price-analysis "0.1.0-SNAPSHOT"
  :description "Land price analysis from 1996 to 2016 using Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                  [org.clojure/clojure "1.6.0"]
                  [midje "1.8.3"]
  ]
  :plugins [
              [lein-midje "3.2"]
  ]
  :main land-price-analysis.core/main)
