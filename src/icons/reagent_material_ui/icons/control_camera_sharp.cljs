(ns reagent-material-ui.icons.control-camera-sharp
  "Imports @material-ui/icons/ControlCameraSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def control-camera-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M5.54 8.46L2 12l3.54 3.54 1.76-1.77L5.54 12l1.76-1.77zm12.92 0l-1.76 1.77L18.46 12l-1.76 1.77 1.76 1.77L22 12zm-6.46 10l-1.77-1.76-1.77 1.76L12 22l3.54-3.54-1.77-1.76zM8.46 5.54l1.77 1.76L12 5.54l1.77 1.76 1.77-1.76L12 2z"}) (e "circle" #js {"cy" "12", "r" "3", "cx" "12"}))
                                           "ControlCameraSharp"))
