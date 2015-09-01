(defproject project-a "0.1.0-SNAPSHOT"
  :description "FIXME: write descriptionxxyzqx"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :plugins [[lonocloud/lein-unison "0.1.8"]]
  :unison
  {:repos [{:git "git@github.com:MichaelDrogalis/test-unison.git"
            :branch "master"
            :merge "develop"
            :project-file "project-b/project.clj"}]})
