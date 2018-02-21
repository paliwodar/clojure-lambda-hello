(ns clojure-lambda-hello.core
  (:require [uswitch.lambada.core :refer [deflambdafn]])
  (:require [amazonica.aws.s3 :as s3])
  (:require [amazonica.aws.s3transfer :as s3transfer]))


(defn handle-event [in out ctx]
  (println "I'm running in the cloud!")
  (doseq [bucket-item (:object-summaries (s3/list-objects :bucket-name "clojure-hello-bucket"))]
    (println "I have following item" (:key bucket-item))

    ))

(deflambdafn clojure-lambda-hello.core.MyLambdaFn [in out ctx]
             (handle-event in out ctx))



