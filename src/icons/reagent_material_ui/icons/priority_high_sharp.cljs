(ns reagent-material-ui.icons.priority-high-sharp
  "Imports @material-ui/icons/PriorityHighSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def priority-high-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "19", "r" "2", "cx" "12"}) (e "path" #js {"d" "M10 3h4v12h-4z"}))
                                          "PriorityHighSharp"))
