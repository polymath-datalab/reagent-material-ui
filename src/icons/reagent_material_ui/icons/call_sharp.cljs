(ns reagent-material-ui.icons.call-sharp
  "Imports @material-ui/icons/CallSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-sharp (create-svg-icon (e "path" #js {"d" "M21 15.46l-5.27-.61-2.52 2.52c-2.83-1.44-5.15-3.75-6.59-6.59l2.53-2.53L8.54 3H3.03C2.45 13.18 10.82 21.55 21 20.97v-5.51z"})
                                 "CallSharp"))
