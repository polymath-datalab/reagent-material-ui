(ns reagent-material-ui.icons.looks-5-two-tone
  "Imports @material-ui/icons/Looks5TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-5-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M19 5H5v14h14V5zm-4 4h-4v2h2c1.1 0 2 .89 2 2v2c0 1.11-.9 2-2 2H9v-2h4v-2H9V7h6v2z", "opacity" ".3"}) (e "path" #js {"d" "M5 21h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2zM5 5h14v14H5V5zm4 8h4v2H9v2h4c1.1 0 2-.89 2-2v-2c0-1.11-.9-2-2-2h-2V9h4V7H9v6z"}))
                                       "Looks5TwoTone"))
