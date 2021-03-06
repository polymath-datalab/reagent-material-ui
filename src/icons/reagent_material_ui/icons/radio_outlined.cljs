(ns reagent-material-ui.icons.radio-outlined
  "Imports @material-ui/icons/RadioOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def radio-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M20 6H8.3l8.26-3.34L15.88 1 3.24 6.15C2.51 6.43 2 7.17 2 8v12c0 1.1.89 2 2 2h16c1.11 0 2-.9 2-2V8c0-1.11-.89-2-2-2zm0 2v3h-2V9h-2v2H4V8h16zM4 20v-7h16v7H4z"}) (e "circle" #js {"cy" "16.48", "r" "2.5", "cx" "8"}))
                                     "RadioOutlined"))
