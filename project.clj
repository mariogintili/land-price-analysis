(defproject land-price-analysis "0.1.0-SNAPSHOT"
  :description "Land price analysis from 1996 to 2016 using Clojure & the Jupyter Notebook"
  :url "https://github.com/mariogintili/land-price-analysis"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                [midje "1.8.3"]]
  :plugins [[lein-midje "3.2"]]
  :main land-price-analysis.core/main)
