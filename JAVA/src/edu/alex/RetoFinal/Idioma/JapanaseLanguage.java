package edu.alex.RetoFinal.Idioma;

public class JapanaseLanguage implements Language {
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "キャットゲームへようこそ";
            case "board":
                return "ボードサイズを選択してください（3または4）：";
            case "boardError":
                return   "無効なボードサイズです。3または4を選んでください";
            case "ModeGame":
                return "ゲームモードを選択してください（マルチプレイヤーまたはAI）";
            case "MultyPlayer":
                return "マルチプレイヤー";
            case "IA":
                return "AI";
            case  "ModeGameError":
                return "無効なゲームモードです。マルチプレイヤーまたはAIを選んでください。";
            case  "TurnPlayer:":
                return "プレイヤーの番";
            case "Row":
                return "行";
            case "Column":
                return "列";
            case "GameWin":
                return " プレイヤーXが勝ちました¡";
            case "GameDraw":
                return "引き分けです!";
            case "MoveInvalid":
                return "無効な動きです。もう一度試してください。";
            case "MoveValid":
                return  "有効な番号を入力してください。";
            case "TurnIA":
                return "プレイヤーXの番";
            case "BoardCurrent":
                return "現在のボード：";
            default:
                return "Message not found";

        }
    }
}
