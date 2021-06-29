(defproject com.signal-ai/throttler "1.0.0-1"
  :description "Control the throughput of function calls and core.async channels using the token bucket algorithm"
  :url "https://github.com/signal-ai/throttler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/core.async "0.4.490"]]
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_username
                                     :password :env/clojars_token
                                     :sign-releases false}]
                        ["snapshots" {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_token}]]
  :profiles {:dev {:dependencies [[midje "1.9.8"]
                                  [criterium "0.4.5"]]
                   :plugins [[lein-midje "3.1.1"]]}})
