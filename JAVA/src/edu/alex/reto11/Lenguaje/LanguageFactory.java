package edu.alex.reto11.Lenguaje;
/**
 * La clase LanguageFactory es una fábrica que permite configurar y obtener mensajes o traducciones en el idioma seleccionado.
 */
public class LanguageFactory {
    private static Language language;
    /**
     * Configura el idioma seleccionado según la opción proporcionada.
     * @param languageOption La opción que representa el idioma seleccionado.
     */
    public static void setLanguage(int languageOption) {
        switch (languageOption) {
            case 1:
                language = new SpanishLanguage();
                break;
            case 2:
                language = new EnglishLanguage();
                break;
            case 3:
                language = new JapaneseLanguage();
                break;
            case 4:
                language = new RussianLanguage();
                break;
            case 5:
                language = new PortugueseLanguage();
                break;

            default:
                System.out.println("Idioma no soportado. Seleccionando español por defecto.");
                language = new SpanishLanguage();
        }
    }
    /**
     * Obtiene un mensaje o traducción en el idioma configurado según la clave proporcionada.
     * @param key La clave que identifica el mensaje o traducción.
     * @return El mensaje o traducción en el idioma configurado correspondiente a la clave especificada.
     */
    public static String getMessage(String key) {
        if (language != null) {
            return language.getMessage(key);
        }
        return "Idioma no configurado";
    }
}
