package edu.alex.RetoFinal.Idioma;

public class LanguageFactory {
    private static Language language;
    public static void setLanguage(int languageOption) {
        switch (languageOption) {
            case 1:
                language = new SpanishLanguge();
                break;
            case 2:
                language = new EnglishLanguage();
                break;
            case 3:
                language = new JapanaseLanguage();
                break;


            default:
                System.out.println("Idioma no soportado. Seleccionando español por defecto.");
                language = new SpanishLanguge();
        }
    }

    public static String getMessage(String key) {
        if (language != null) {
            return language.getMessage(key);
        }
        return "Idioma no configurado";
    }
}
