(ns reagent-material-ui.icons.library-add-check-sharp
  "Imports @material-ui/icons/LibraryAddCheckSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def library-add-check-sharp (create-svg-icon (e "path" #js {"d" "M22 2H6v16h16V2zm-9.53 12L9 10.5l1.4-1.41 2.07 2.08L17.6 6 19 7.41 12.47 14zM4 6H2v16h16v-2H4V6z"})
                                              "LibraryAddCheckSharp"))
