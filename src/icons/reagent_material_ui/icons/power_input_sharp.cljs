(ns reagent-material-ui.icons.power-input-sharp
  "Imports @material-ui/icons/PowerInputSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def power-input-sharp (create-svg-icon (e "path" #js {"d" "M2 9v2h19V9H2zm0 6h5v-2H2v2zm7 0h5v-2H9v2zm7 0h5v-2h-5v2z"})
                                        "PowerInputSharp"))
