(ns reagent-material-ui.icons.deck
  "Imports @material-ui/icons/Deck as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def deck (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M22 9L12 2 2 9h9v13h2V9z"}) (e "path" #js {"d" "M4.14 12l-1.96.37.82 4.37V22h2l.02-4H7v4h2v-6H4.9zM19.1 16H15v6h2v-4h1.98l.02 4h2v-5.26l.82-4.37-1.96-.37z"}))
                           "Deck"))
