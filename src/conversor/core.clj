(ns conversor.core
  (:require [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(def opcoes-do-programa
  [["-d" "--de	moeda	base" "moeda	base	para	conversão"
    :default	"eur"]
   ["-p" "--para	moeda	destino"
    "moeda	a	qual	queremos	saber	o	valor"]])

(def api-key "189bcf4014b21f207f37")
(def	api-url "https://free.currencyconverterapi.com/api/v6/convert")

(http-client/get	api-url
                  {:query-params	{"q" "USD_BRL"
                                   "apiKey"	api-key}})

(defn -main
  [& args]
  (prn "As opções são:" (:options
                          (parse-opts args opcoes-do-programa))))
