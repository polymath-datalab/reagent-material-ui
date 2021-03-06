(ns reagent-material-ui.icons.format-align-center-two-tone
  "Imports @material-ui/icons/FormatAlignCenterTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-align-center-two-tone (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3zm4 12h10v2H7zm0-8h10v2H7zm-4 4h18v2H3zm0 8h18v2H3z"})
                                                   "FormatAlignCenterTwoTone"))
