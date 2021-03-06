(ns reagent-material-ui.icons.assistant-photo-sharp
  "Imports @material-ui/icons/AssistantPhotoSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def assistant-photo-sharp (create-svg-icon (e "path" #js {"d" "M14.4 6L14 4H5v17h2v-7h5.6l.4 2h7V6h-5.6z"})
                                            "AssistantPhotoSharp"))
