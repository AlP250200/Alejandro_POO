package edu.alex.reto12.Idioma;
/**
 * La clase JapaneseLanguage implementa la interfaz Language y proporciona traducciones en japonés para una serie de claves.
 */
public class JapaneseLanguage implements Language{
    /**
     * Obtiene un mensaje o traducción en japonés según la clave proporcionada.
     * @param key La clave que identifica el mensaje o traducción.
     * @return El mensaje o traducción en japonés correspondiente a la clave especificada.
     */
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "算術計算機へようこそ";
            case "select_option":
                return "オプションを選択してください：";
            case "invalid_option":
                return "無効なオプション。もう一度お試しください。";
            case "continue":
                return "続行しますか (はい/いいえ)？：";
            case "exit":
                return "終了しています...";
            case "enter_first_number":
                return "最初の数を入力してください：";
            case "enter_second_number":
                return "第二の数を入力してください：";
            case "enter_raiz":
                return "基数を入力してください：";
            case "enter_base":
                return "私たちが根を下ろす番号を教えてください ";
            case "enter_base_power":
                return "パワーベースに入る";
            case "enter_exponent":
                return "指数を入力してください：";
            case "enter_dividend":
                return "被除数を入力してください：";
            case "enter_divisor":
                return "除数を入力してください：";
            case "enter_modulo_number":
                return "モジュロ計算のための数値を入力してください：";
            case "enter_modulo_divisor":
                return "モジュロ計算のための除数を入力してください：";
            case "enter_logarithm_number":
                return "対数計算のための数値を入力してください：";
            case "enter_logarithm_base":
                return "対数計算のための基数を入力してください：";
            case "result":
                return "結果：";
            case "menu":
                return "メニュー:\n1. 加算\n2. 減算\n3. 乗算\n4. べき乗\n5. 除算\n6. 剰余\n7. 対数\n8. 平方根\n0. 終了\nオプションを選択してください：";
            case "operation_description":
                return "操作：";
            case  "is":
                return  "は";
            case "Adding":
                return "追加";
            case "Subtracting":
                return "減算";
            case  "Multiplying":
                return "乗算";
            case "Dividing":
                return "分割";
            case "Calculating the modulus of":
                return "弾性率の計算";
            case "Calculating the logarithm of: ":
                return  "の対数を計算する： ";
            case "Raising":
                return "育てる：";
            case "Calculating the square root of: ":
                return "の平方根を計算する：";
            case "Do you want to see the arithmetic operations performed so far? (s/S):":
                return  "これまでに行われた算術演算を見たいですか？（はい／いいえ）";
            default:
                return "メッセージが見つかりません";
        }
    }
}
