
on join:
    send "【あなたにご支援のお願いです。スクロールせずにご覧ください】檜華県参加者の皆さま、こんにちは。檜華県サーバーをよく利用いただいてるようですね
    とても嬉しいです。申し訳にくいのですがあなたからの支援が必要なのです。このサーバーの運営は非営利団体であり、営業担当はおりません
    私たちは特別な一般の参加者からの寄付で運営されていますが、寄付をしてくださる方はほとんどいらっしゃりません
    もしあなたが100円寄付してくだされば、このまま運営を続けていくことが出来ます。どうぞよろしくお願いいたします。
    このメッセージは全員に送信されます" to player

command /hibana:
    trigger:
        open chest inventory with 6 row named "&e&l檜華メニュー v0.1beta" to player
        set {_i} to 0
        set {_glass} to white glass pane named "&c&lクリック不可"
        loop 54 times:
            set slot {_i} of player's current inventory to {_glass}
            add 1 to {_i}
        set slot 9 of player's current inventory to compass named "&6移動"
        set slot 10 of player's current inventory to torch named "移動→新井宿"
        set slot 11 of player's current inventory to torch named "移動→檜華駅"
        set slot 12 of player's current inventory to torch named "京王プラザホテル"
        set slot 13 of player's current inventory to torch named "新大久保駅"
        set slot 14 of player's current inventory to torch named "鷹町"
        set slot 15 of player's current inventory to torch named "歌舞伎町"
        set slot 16 of player's current inventory to torch named "西新宿1丁目"
        set slot 16 of player's current inventory to torch named ""
        set slot 17 of player's current inventory to barrier named "アイテム"
        set slot 27 of player's current inventory to barrier named "&1ゲームモード"
        set slot 28 of player's current inventory to sapling named "街路樹（樫）"
        set slot 29 of player's current inventory to glass named "スペクテイター"
        set slot 53 of player's current inventory to barrier named "閉じる"
        set slot 18 of player's current inventory to chest named "&6アイテム"
        set slot 45 of player's current inventory to barrier named "試験中"
        set slot 19 of player's current inventory to barrier named "木の斧"
        set slot 20 of player's current inventory to stick named "アイテム入手→デバック棒"


on inventory click:
    name of clicked inventory is "&e&l檜華メニュー v0.1beta"
    cancel event
    if event-item is torch named "移動→新井宿":　　
        teleport player to location(178, 16, 221, world)
    if event-item is torch named "檜華駅":
        teleport player to location(1, 30, -1800, world)
    if event-item is torch named "京王プラザホテル":
        teleport player to location(-249, 20, 564, world)
    if event-item is torch named "鷹町":
        teleport player to location(270, 16, -665, world)
    if event-item is torch named "三鷹駅":
        teleport player to location(-167, 15, -306, world)
    if event-item is torch named "歌舞伎町":
        teleport player to location(352, 16, 206, world)
    if event-item is torch named "西新宿1丁目":
        teleport player to location(-49, 16, 586, world)
    if event-item is stick named "アイテム入手→デバック棒":
    if event-item is sapling named "街路樹（樫）":
        command "//paste"
    if event-item is barrier named "木の斧":
        command "/give %player% wooden_axe"
    if event-item is glass named "クリエイティブ":
        command "/gamemode creative %player% "
    if event-item is glass named "スペクテイター":
        command "/gamemode spectator %player% "
    if event-item is stone named "Yeah":
        send "Yeah" to player
    if event-item is barrier named "閉じる":
        close player's inventory

    //[day100years?"ob_start"]
