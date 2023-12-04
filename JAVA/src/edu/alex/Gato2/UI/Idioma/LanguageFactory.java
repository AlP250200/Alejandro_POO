package edu.alex.Gato2.UI.Idioma;

public class LanguageFactory {
    private static Language language;
    /**
     * Configura el idioma seleccionado según la opción proporcionada.
     * @param languageOption La opción que representa el idioma seleccionado.
     */
    public static void setLanguage(int languageOption) {
        switch (languageOption) {
            case 1:
                language = new Spanish();
                break;
            case 2:
                language = new English();
                break;
            default:

                System.out.println("Idioma no soportado. Seleccionando español por defecto.");
                language = new Spanish();
        }
    }

    public static String getMessage(String key) {
        if (language != null) {
            return language.getMessage(key);
        }
        return "Idioma no configurado";
    }
}
