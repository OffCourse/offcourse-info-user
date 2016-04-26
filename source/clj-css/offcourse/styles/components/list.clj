(ns offcourse.styles.components.list
  (:refer-clojure :exclude [first last list])
  (:require [offcourse.styles.vocabulary :as v]))

(defn list-component [{:keys [templates borders colors fonts units]}]

  [[v/list        (merge (:column-component templates))
    [v/list--item (merge (:row-component templates)
                       (:recycled-paper templates)
                       (:title templates)
                       {:margin-bottom   (:sixth units)
                        :align-items     :center
                        :font-size       (:subtitle-font units)
                        :padding         (:half units)
                        :height          (:one-and-half units)})]]

   [v/edit-list
    [v/list--item (merge {:justify-content :space-between
                          :padding 0
                          :background-color (:day colors)})
     [v/icon-button {:font-size (:two-third units)}]
     [:span
      [v/first (merge (:recycled-paper templates)
                      {:flex 1
                       :display :flex
                       :padding (:half units)
                       :align-items :center
                       :height (:one-and-half units)
                       :margin-right (:sixth units)})]]]]

   [v/todo-list
    [v/list--item {:justify-content :flex-start}
     [v/hovered (:selected templates)]
     [v/selected (:highlighted templates)]]]])