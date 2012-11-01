(defproject newshound "0.0.1-SNAPSHOT"
  :description "Ace Reporting"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojars.ghoseb/cron4j "2.2.1"]
                 [com.draines/postal "1.8.0"]
                 [hiccup "1.0.1"]
                 [korma "0.3.0-beta7"]
                 ;; Add the appropriate JDBC drivers for databases here.
                 ]
  :main newshound.core)
