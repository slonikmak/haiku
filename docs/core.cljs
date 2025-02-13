
(def cards
  [{:author "Мацуа Басё"
    :japanese "春の夜や\n窓辺に咲く梅\nそっと香る"
    :russian "Весенняя ночь –\nУ окна распускается слива,\nНежно источая аромат."
    :english "A spring night –\nPlum blossoms by the window\nWhisper their scent."}
   {:author "Мацуа Басё"
    :japanese "月光の\n君の眼影に\n溶けゆく想い"
    :russian "Лунный свет\nРастворяется в тенях твоих глаз –\nНежное чувство."
    :english "Moonlight\nMelts into the shadow of your eyes –\nA tender longing."}
   {:author "Мацуа Басё"
    :japanese "花の色は\n儚く映る\n恋の影"
    :russian "Цветы меркнут,\nКак мимолетно отражён\nОтголосок любви."
    :english "The color of blossoms\nFlickers so briefly –\nLike the shadow of love."}
   {:author "Мацуа Басё"
    :japanese "風に乗り\n君の笑み運ぶ\n夜の帳"
    :russian "На ветру\nТвой смех, как лёгкий шёпот,\nСкрывается в ночи."
    :english "On the breeze,\nYour smile is carried along\nUnder the night’s veil."}
   {:author "Мацуа Басё"
    :japanese "朝露や\n静かに覚む\n恋の夢"
    :russian "Утренняя роса –\nОсторожно пробуждает\nСон о любви."
    :english "Morning dew –\nGently awakens\nA dream of love."}
   {:author "Мацуа Басё"
    :japanese "桜散る\n君を想ふ夜\n星ひとつ"
    :russian "Сакура опадает,\nВ ночь, когда я вспоминаю тебя,\nОдинокая звезда мерцает."
    :english "Cherry petals fall –\nOn a night thinking of you,\nA lone star gleams."}
   {:author "Мацуа Басё"
    :japanese "静けさに\n君の声重ね\n風そよぐ"
    :russian "В тишине\nТвой голос сливается\nС шёпотом ветра."
    :english "In the stillness,\nYour voice merges with the wind –\nA soft murmur."}
   {:author "Мацуа Басё"
    :japanese "夏草に\n刻まる二つの\n心の影"
    :russian "На летней траве\nДве души оставляют\nСвой едва уловимый след."
    :english "In the summer grass\nTwo hearts leave their subtle mark –\nA quiet echo."}
   {:author "Мацуа Басё"
    :japanese "夜露に\n君との語らい\n灯火揺れ"
    :russian "Ночная роса\nКолышет огонёк\nНаших разговоров."
    :english "In the night’s dew,\nOur whispered conversation\nShimmers like a lamp."}
   {:author "Мацуа Басё"
    :japanese "星降る夜\n君の面影を\n夢に見る"
    :russian "Под звёздным небом\nВ мечтах вижу твой лик –\nТихое обещание."
    :english "On a starry night,\nI see your visage in dreams –\nA silent promise."}
   {:author "Йоса Бусон"
    :japanese "春風や\n君の頬撫でる\n花の香り"
    :russian "Весенний ветер\nЛасково касается\nТвоей щеки, как аромат цветов."
    :english "Spring breeze –\nCaressing your cheek\nWith the scent of blossoms."}
   {:author "Йоса Бусон"
    :japanese "露の音\n君への想いを\nそっと映す"
    :russian "Звук росы\nНежно отражает\nМои чувства к тебе."
    :english "The sound of dew\nGently reflects my feelings\nFor you."}
   {:author "Йоса Бусон"
    :japanese "夕暮れに\n二つの影が\nひとつ重なる"
    :russian "В сумерках\nДве тени сливаются\nВ единство."
    :english "At dusk,\nTwo shadows merge as one –\nA quiet union."}
   {:author "Йоса Бусон"
    :japanese "月見れば\n君の微笑み\n浮かび上がる"
    :russian "Увидев луну,\nМне на ум приходит\nТвой нежный улыбка."
    :english "When I behold the moon,\nYour smile appears\nIn its gentle glow."}
   {:author "Йоса Бусон"
    :japanese "花道に\n君の足跡を\n追いかける"
    :russian "По аллее цветущих лепестков\nЯ следую за\nСледом твоих шагов."
    :english "Along the flowered path,\nI follow the traces\nOf your steps."}
   {:author "Йоса Бусон"
    :japanese "風の音\n君の名を呼び\n花は囁く"
    :russian "Шёпот ветра\nЗовет имя твоё,\nА цветы тихо отвечают."
    :english "The sound of the wind\nCalls out your name –\nAnd the blossoms whisper."}
   {:author "Йоса Бусон"
    :japanese "雨上がり\n君の面影を\n水面映す"
    :russian "После дождя\nНа водной глади\nОтражается твой лик."
    :english "After the rain,\nYour image is reflected\nUpon the water."}
   {:author "Йоса Бусон"
    :japanese "初夏の\n光に透ける\n君のシルエット"
    :russian "В начале лета\nСилуэт твой едва различим\nВ прозрачном свете."
    :english "In early summer,\nYour silhouette shines\nIn the transparent light."}
   {:author "Йоса Бусон"
    :japanese "遠き山\n君を重ね見る\n心の旅"
    :russian "В далеких горах\nЯ вижу тебя в каждом изгибе –\nПутешествие сердца."
    :english "In the distant mountains,\nI see you reflected –\nA journey of the heart."}
   {:author "Йоса Бусон"
    :japanese "夜風に\n君の香り乗り\n夢は漂う"
    :russian "На ночном ветру\nТвой аромат уносится,\nА мечты плывут легко."
    :english "On the night wind,\nYour fragrance drifts –\nAnd dreams float along."}
   {:author "Кобаяши Исса"
    :japanese "露の命\n儚さに映る\n恋の一瞬"
    :russian "Жизнь росы –\nТакая мимолетная, как\nМгновение любви."
    :english "Life of dew –\nSo fleeting mirrors\nAn instant of love."}
   {:author "Кобаяши Исса"
    :japanese "一瞬の\n光の中に\n君を想ふ"
    :russian "В миг проблеска света\nЯ нежно вспоминаю\nТебя."
    :english "In a moment’s light,\nI hold you in my thoughts –\nA tender glimmer."}
   {:author "Кобаяши Исса"
    :japanese "君の眼\n澄み渡る空\n恋の鏡"
    :russian "Твои глаза,\nКак чистое небо,\nЗеркало любви."
    :english "Your clear eyes\nReflect the vast sky –\nA mirror of love."}
   {:author "Кобаяши Исса"
    :japanese "朝露や\n君の温もりを\nそっと抱く"
    :russian "Утренняя роса\nОберегает тепло\nТвоей души."
    :english "Morning dew –\nGently embraces\nThe warmth of you."}
   {:author "Кобаяши Исса"
    :japanese "風そよぐ\n君の声遠く\n山に溶け"
    :russian "Легкий ветер\nНесет твой голос вдали,\nРастворяясь в горах."
    :english "The gentle wind –\nYour distant voice\nMelts into the mountains."}
   {:author "Кобаяши Исса"
    :japanese "花散るや\n君と過ごす時\n永遠かな"
    :russian "Когда лепестки падают,\nМоменты с тобой\nКажутся вечностью."
    :english "As flowers fall,\nThe time spent with you\nFeels eternal."}
   {:author "Кобаяши Исса"
    :japanese "水面に\n映る君の影\n恋の詩"
    :russian "На поверхности воды\nТвой образ звучит –\nПоэма любви."
    :english "On the water’s face,\nYour reflection sings\nA love poem."}
   {:author "Кобаяши Исса"
    :japanese "夏の夜\n君と語らう\n蛍の舞"
    :russian "Летней ночью\nБеседуя с тобой,\nСверкают светлячки."
    :english "On a summer night,\nTalking with you\nAs fireflies dance."}
   {:author "Кобаяши Исса"
    :japanese "夕闇に\n君の笑み灯す\n小さな光"
    :russian "В сумерках\nТвой улыбчивый свет\nЗажигает искру."
    :english "In the twilight,\nYour smile lights up\nA tiny glow."}
   {:author "Кобаяши Исса"
    :japanese "夢の中\n君と歩む道\n星降る空"
    :russian "Во сне\nМы идем по дороге,\nПод звёздным небом."
    :english "In a dream,\nWalking the path with you\nBeneath a starry sky."}
   {:author "Масаока Шики"
    :japanese "暁の光\n君を想う心\n朝露に似"
    :russian "При свете зари\nМое сердце, вспоминая тебя,\nКак роса на рассвете."
    :english "At dawn’s first light,\nMy heart, thinking of you,\nIs like the morning dew."}
   {:author "Масаока Шики"
    :japanese "秋雨や\n君への想いを\n静かに洗う"
    :russian "Осенний дождь\nМедленно смывает\nМысли о тебе."
    :english "Autumn rain –\nGently washes away\nMy thoughts of you."}
   {:author "Масаока Шики"
    :japanese "銀の風\n君への情熱を\n奏でにけり"
    :russian "Серебряный ветер\nИзливает страсть\nК тебе в аккордах."
    :english "Silver wind\nPlays a melody\nOf passion for you."}
   {:author "Масаока Шики"
    :japanese "窓辺にて\n君を待つ心\n冬の陽射し"
    :russian "У окна,\nМое сердце, ожидая тебя,\nТеплеет, как зимнее солнце."
    :english "By the window,\nMy waiting heart for you\nWarms like winter sunlight."}
   {:author "Масаока Шики"
    :japanese "夜静か\n君の名を呼ぶ\n虫の音"
    :russian "В тихой ночи\nЗвуки насекомых\nШепчут твоё имя."
    :english "In the quiet night,\nThe chirp of insects\nCalls out your name."}
   {:author "Масаока Шики"
    :japanese "花影に\n君の笑顔浮かぶ\n春の記憶"
    :russian "В тени цветов\nВсплывает образ\nТвоей улыбки – память весны."
    :english "In the shadow of flowers,\nYour smile appears –\nA memory of spring."}
   {:author "Масаока Шики"
    :japanese "雲流る\n君の恋しさを\n空に描く"
    :russian "Облака плывут,\nРисуя на небе\nТоску по тебе."
    :english "Clouds drifting by\nSketch the longing for you\nAcross the sky."}
   {:author "Масаока Шики"
    :japanese "潮騒の\n音に重ねるは\n君の呼び声"
    :russian "Звук прибоя\nСмешивается с эхом\nТвоего голоса."
    :english "The sound of the tide\nMingles with my heart –\nYour call in the waves."}
   {:author "Масаока Шики"
    :japanese "星降る夜\n君と見る夢は\n風の詩"
    :russian "В ночи, где падают звёзды,\nНаши сны\nЗвучат, как поэма ветра."
    :english "On a starry night,\nThe dreams we share\nAre poems of the wind."}
   {:author "Масаока Шики"
    :japanese "明け方に\n君の面影と\n陽が交わる"
    :russian "На рассвете\nОбраз твой встречается\nС первыми лучами солнца."
    :english "At daybreak,\nYour image and the sun\nMeet in gentle union."}
   {:author "Кага но Чиё"
    :japanese "夕焼けに\n君の唇映る\n桜の色"
    :russian "На закате\nТвои губы отражают\nЦвет сакуры."
    :english "At sunset,\nYour lips are mirrored\nIn the color of cherry blossoms."}
   {:author "Кага но Чиё"
    :japanese "風の囁\n君と分かち合う\n小さな夢"
    :russian "Шёпот ветра\nДелит с нами\nМаленькую мечту."
    :english "The whisper of wind\nShares with me\nOur little dream."}
   {:author "Кага но Чиё"
    :japanese "月光や\n君の影ひとつ\n夜に溶ける"
    :russian "Лунный свет –\nТвоя одинокая тень\nРастворяется в ночи."
    :english "Moonlight –\nYour solitary shadow\nMelts into the night."}
   {:author "Кага но Чиё"
    :japanese "朝顔に\n君の想い映し\n光踊る"
    :russian "На утренней глицинии\nОтражается твоя нежность,\nИ свет начинает танцевать."
    :english "On the morning glory,\nYour feelings reflect\nAs dancing light."}
   {:author "Кага но Чиё"
    :japanese "雨滴が\n君の微笑みを\n窓に映す"
    :russian "Капли дождя\nОтражают твой мягкий смех\nНа оконном стекле."
    :english "Raindrops\nReflect your gentle smile\nOn the window."}
   {:author "Современный автор"
    :japanese "夜空に\n君と描く夢\n光の軌跡"
    :russian "В ночном небе\nМы чертим мечты,\nСвет оставляет след."
    :english "In the night sky,\nThe dreams we draw together\nBecome trails of light."}
   {:author "Современный автор"
    :japanese "星の海\n君と漂う\n無限の愛"
    :russian "В океане звёзд\nМы плывём вместе –\nЛюбовь без границ."
    :english "Across a sea of stars,\nWe drift together –\nIn infinite love."}
   {:author "Современный автор"
    :japanese "風待つ\n君の温もりが\n鼓動重ね"
    :russian "Ждущий ветер,\nТвоё тепло сливается\nС биением сердца."
    :english "Awaiting the wind,\nYour warmth joins with\nThe beat of my heart."}
   {:author "Современный автор"
    :japanese "雨上がり\n君と歩む道\n虹の橋"
    :russian "После дождя\nДорога, по которой идем вместе,\nСтановится радужным мостом."
    :english "After the rain,\nThe path we walk together\nBecomes a rainbow bridge."}
   {:author "Современный автор"
    :japanese "静かな夜\n君の名を囁く\n月の詩"
    :russian "В тихую ночь\nЛуна шепчет\nТвоё имя, как поэму."
    :english "On a quiet night,\nThe moon recites a poem\nWhispering your name."}])

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
