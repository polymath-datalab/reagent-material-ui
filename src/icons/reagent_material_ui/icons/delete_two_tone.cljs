(ns reagent-material-ui.icons.delete-two-tone
  "Imports @material-ui/icons/DeleteTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def delete-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M8 9h8v10H8z", "opacity" ".3"}) (e "path" #js {"d" "M15.5 4l-1-1h-5l-1 1H5v2h14V4zM6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM8 9h8v10H8V9z"}))
                                      "DeleteTwoTone"))
