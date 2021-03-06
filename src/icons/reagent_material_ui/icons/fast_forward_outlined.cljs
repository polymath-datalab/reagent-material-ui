(ns reagent-material-ui.icons.fast-forward-outlined
  "Imports @material-ui/icons/FastForwardOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def fast-forward-outlined (create-svg-icon (e "path" #js {"d" "M15 9.86L18.03 12 15 14.14V9.86m-9 0L9.03 12 6 14.14V9.86M13 6v12l8.5-6L13 6zM4 6v12l8.5-6L4 6z"})
                                            "FastForwardOutlined"))
