(ns conversor.interpretador_de_opcoes
  (:require [clojure.tools.cli :refer [parse-opts]])
)

(def opcoes-do-programa
  [
    ["-d" "--de moeda base" "moeda base para conversão" :default "EUR"]
    ["-p" "--para moeda destino" "moeda a qual queremos saber o valor"]
  ]
)

(defn interpretar-opcoes [argumentos]
  (:options (parse-opts argumentos opcoes-do-programa)))