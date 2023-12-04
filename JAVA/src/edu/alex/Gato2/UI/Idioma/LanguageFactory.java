package edu.alex.Gato2.UI.Idioma;
/**
 * La clase LanguageFactory es una fábrica de idiomas que gestiona el idioma para la obtención de mensajes.
 * Permite configurar el idioma y obtener mensajes en el idioma seleccionado.
 */
public class LanguageFactory {
    private static Language language;
    /**
     * Establece el idioma seleccionado.
     * @param languageOption La opción de idioma seleccionada (1 para español, 2 para inglés)
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
    /**
     * Obtiene un mensaje en el idioma configurado.
     * @param key La clave del mensaje a obtener
     * @return El mensaje correspondiente en el idioma seleccionado, o un mensaje indicando que el idioma no está configurado
     */
    public static String getMessage(String key) {
        if (language != null) {
            return language.getMessage(key);
        }
        return "Idioma no configurado";
    }
}
