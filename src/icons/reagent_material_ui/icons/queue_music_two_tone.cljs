(ns reagent-material-ui.icons.queue-music-two-tone
  "Imports @material-ui/icons/QueueMusicTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def queue-music-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "17", "r" "1", "cx" "16", "opacity" ".3"}) (e "path" #js {"d" "M3 10h12v2H3zM3 14h8v2H3zM3 6h12v2H3z"}) (e "path" #js {"d" "M17 14.18c-.31-.11-.65-.18-1-.18-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3V8h3V6h-5v8.18zM16 18c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"}))
                                           "QueueMusicTwoTone"))
