(require '[lumo.build.api :as b])

(b/build "src"
  {:output-to "main.js"
   :optimizations :advanced})
