(defproject pid-control "0.1.0-SNAPSHOT"
  :description "Clojure version of PID controller project from Udacity's self-driving car engineer nanodegree"
  :url "https://github.com/ericlavigne/CarND-PID-Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [http-kit "2.3.0"]
                 [jarohen/chord "0.8.1" :exclude http-kit]
                 [same/ish "0.1.1"]]
  :main ^:skip-aot pid-control.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
