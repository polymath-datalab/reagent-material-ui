(ns reagent-material-ui.icons.format-color-fill-sharp
  "Imports @material-ui/icons/FormatColorFillSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-color-fill-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M17.62 10l-10-10-1.41 1.41 2.38 2.38L2.38 10 10 17.62 17.62 10zM5.21 10L10 5.21 14.79 10H5.21zM19 11.5s-2 2.17-2 3.5c0 1.1.9 2 2 2s2-.9 2-2c0-1.33-2-3.5-2-3.5z"}) (e "path" #js {"d" "M0 20h24v4H0v-4z", "fillOpacity" ".36"}))
                                              "FormatColorFillSharp"))
