(ns reagent-material-ui.icons.camera-alt-sharp
  "Imports @material-ui/icons/CameraAltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def camera-alt-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "12", "r" "3", "cx" "12"}) (e "path" #js {"d" "M16.83 4L15 2H9L7.17 4H2v16h20V4h-5.17zM12 17c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"}))
                                       "CameraAltSharp"))
