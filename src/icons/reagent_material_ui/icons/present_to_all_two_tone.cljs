(ns reagent-material-ui.icons.present-to-all-two-tone
  "Imports @material-ui/icons/PresentToAllTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def present-to-all-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M3 19.02h18V4.98H3v14.04zM12 8l4 4h-2v4h-4v-4H8l4-4z", "opacity" ".3"}) (e "path" #js {"d" "M10 16h4v-4h2l-4-4-4 4h2zM21 3H3c-1.11 0-2 .89-2 2v14c0 1.11.89 2 2 2h18c1.11 0 2-.89 2-2V5c0-1.11-.89-2-2-2zm0 16.02H3V4.98h18v14.04z"}))
                                              "PresentToAllTwoTone"))
