package edu.alex.reto12.Idioma;
/**
 * La interfaz Language define un contrato para las clases que proporcionan mensajes y traducciones en diferentes idiomas.
 */
public interface Language {
    /**
     * Obtiene un mensaje o traducción en el idioma correspondiente según una clave dada.
     * @param key La clave que identifica el mensaje o traducción.
     * @return El mensaje o traducción en el idioma especificado.
     */
    String getMessage(String key);
}
