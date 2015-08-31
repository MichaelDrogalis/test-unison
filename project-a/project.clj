(defproject project-a "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :unison
  {:repos [{:git "git@github.com:MichaelDrogalis/test-unison.git"
            :branch "master"
            :project-file "project-b/project.clj"}]})
