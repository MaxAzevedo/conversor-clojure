(ns conversor.core
  (:require [conversor.formatador :refer [formatar]]
            [conversor.interpretador_de_opcoes :refer [interpretar-opcoes]]
            [conversor.cambista :refer [obter-cotacao]])
)

(defn -main
  [& args]
  (let [{:keys [de para]} (interpretar-opcoes args)]
    (-> (obter-cotacao de para)
        (formatar de para)
        (prn)
    )
  )
)
