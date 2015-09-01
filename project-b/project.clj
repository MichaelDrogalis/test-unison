(defproject project-b "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 ^{:voom {:repo "git@github.com:MichaelDrogalis/test-unison.git" :branch "master"}}
                 [project-a "0.1.0-20150901_193150-g9d335eb"]])
