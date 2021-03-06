(ns reagent-material-ui.icons.music-note-sharp
  "Imports @material-ui/icons/MusicNoteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def music-note-sharp (create-svg-icon (e "path" #js {"d" "M12 3v10.55c-.59-.34-1.27-.55-2-.55-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4V7h4V3h-6z"})
                                       "MusicNoteSharp"))
