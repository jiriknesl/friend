(ns friend.modules.timer
  (:require overtone.at-at))

(defn make-timer [seconds] {:actual 0 :seconds seconds :running true})
(defn increase-timer [timer] (update timer :actual inc))
(defn is-done [timer] (< (:actual timer) (:seconds timer)))
(defn on-second [timer-atom]
  (do 
    (swap! timer-atom increase-timer)
    (when (is-done @timer-atom)
      (do 
        (stop-timer timer-atom)
        (notify-timer timer-atom)))))
