
(def haiku-cards
  [{:author   "Современный автор"
    :japanese "風待つ\n君の温もりが\n鼓動重ень"
    :russian  "Ждущий ветер,\nТвоё тепло сливается\nС биением сердца."
    :english  "Awaiting the wind,\nYour warmth joins with\nThe beat of my heart."}
   ;; можно добавить другие карточки
   ])

(defn display-random-card []
      (let [card         (rand-nth cards)
            author-el    (.getElementById js/document "author")
            japanese-el  (.getElementById js/document "japanese")
            english-el   (.getElementById js/document "english")
            russian-el   (.getElementById js/document "russian")]
           (set! (.-innerText author-el) (str "Автор: " (:author card)))
           (set! (.-innerText japanese-el) (:japanese card))
           (set! (.-innerText english-el) (:english card))
           (set! (.-innerText russian-el) (:russian card))))



(defn init []
      (println "!!!!!")
      (set! (.-onclick (.getElementById js/document "app")) display-random-card)
      (display-random-card))

(set! (.-onload js/window) init)
