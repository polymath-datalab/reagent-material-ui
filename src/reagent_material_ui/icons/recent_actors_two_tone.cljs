(ns reagent-material-ui.icons.recent-actors-two-tone
  "Imports @material-ui/icons/RecentActorsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def recent-actors-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M13 7H3v10h10V7zM8 8c1.07 0 1.95.87 1.95 1.95 0 1.07-.87 1.95-1.95 1.95s-1.95-.87-1.95-1.95S6.93 8 8 8zm3.89 8H4.11v-.65c0-1.3 2.59-1.95 3.89-1.95s3.89.65 3.89 1.95V16z", "opacity" ".3"}) (e "path" #js {"d" "M21 5h2v14h-2zm-4 0h2v14h-2zm-3 14c.55 0 1-.45 1-1V6c0-.55-.45-1-1-1H2c-.55 0-1 .45-1 1v12c0 .55.45 1 1 1h12zM3 7h10v10H3V7z"}) (e "circle" #js {"cy" "9.94", "r" "1.95", "cx" "8"}) (e "path" #js {"d" "M8 13.4c-1.3 0-3.89.65-3.89 1.95V16h7.78v-.65c0-1.3-2.59-1.95-3.89-1.95z"}))
                                             "RecentActorsTwoTone"))