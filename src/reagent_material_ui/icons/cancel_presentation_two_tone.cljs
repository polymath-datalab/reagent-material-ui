(ns reagent-material-ui.icons.cancel-presentation-two-tone
  "Imports @material-ui/icons/CancelPresentationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def cancel-presentation-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M3 19.1h18V4.95H3V19.1zm5-9.74l1.41-1.41L12 10.54l2.59-2.59L16 9.36l-2.59 2.59L16 14.54l-1.41 1.41L12 13.36l-2.59 2.59L8 14.54l2.59-2.59L8 9.36z", "opacity" ".3"}) (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H3V5h18v14zM9.41 15.95L12 13.36l2.59 2.59L16 14.54l-2.59-2.59L16 9.36l-1.41-1.41L12 10.54 9.41 7.95 8 9.36l2.59 2.59L8 14.54z"}))
                                                   "CancelPresentationTwoTone"))