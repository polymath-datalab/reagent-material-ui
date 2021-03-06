(ns reagent-material-ui.icons.format-color-text
  "Imports @material-ui/icons/FormatColorText as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-color-text (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 20h24v4H0z", "fillOpacity" ".36"}) (e "path" #js {"d" "M11 3L5.5 17h2.25l1.12-3h6.25l1.12 3h2.25L13 3h-2zm-1.38 9L12 5.67 14.38 12H9.62z"}))
                                        "FormatColorText"))
