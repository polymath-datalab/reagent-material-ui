(ns reagent-material-ui.icons.subdirectory-arrow-right
  "Imports @material-ui/icons/SubdirectoryArrowRight as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def subdirectory-arrow-right (create-svg-icon (e "path" #js {"d" "M19 15l-6 6-1.42-1.42L15.17 16H4V4h2v10h9.17l-3.59-3.58L13 9l6 6z"})
                                               "SubdirectoryArrowRight"))
