(defproject my-sandbox "1.0-SNAPSHOT"
  :description "My Encanter Project"
  :url "http://joelholder.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [incanter "1.9.0"]]
  :main com.mycompany.app.core
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :java-source-paths ["src/main/java"]
  :java-test-paths ["src/test/java"] 
  :resource-paths ["resources"]
  :aot :all)
