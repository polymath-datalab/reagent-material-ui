(ns reagent-material-ui.icons.merge-type-outlined
  "Imports @material-ui/icons/MergeTypeOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def merge-type-outlined (create-svg-icon (e "path" #js {"d" "M17 20.41L18.41 19 15 15.59 13.59 17 17 20.41zM7.5 8H11v5.59L5.59 19 7 20.41l6-6V8h3.5L12 3.5 7.5 8z"})
                                          "MergeTypeOutlined"))
