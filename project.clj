(defproject readme-generator "0.1.0-SNAPSHOT"
  :description "Generate readme using emojies"
  :url "https://github.com/ignatev/readme-generator"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :main ^:skip-aot readme-generator.server
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring-jetty-adapter "1.8.1"]
                 [compojure "1.6.1"]])