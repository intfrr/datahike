(ns datahike.constants)

(def ^:const e0 0)
(def ^:const tx0 0x20000000)
(def ^:const emax 0x7FFFFFFF)
(def ^:const txmax 0x7FFFFFFF)
(def ^:const implicit-schema {:db/ident {:db/unique :db.unique/identity}})

(def ^:const default-index-b-factor 17)
(def ^:const default-index-data-node-size 300)
(def ^:const default-index-log-size (- 300 17))