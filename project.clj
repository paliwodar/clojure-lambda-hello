(defproject clojure-lambda-hello "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [uswitch/lambada "0.1.2"]
                 [amazonica "0.3.119" :exclusions [com.amazonaws/aws-java-sdk]]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
