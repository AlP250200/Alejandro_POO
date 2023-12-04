package edu.alex.Gato2.UI.Idioma;
/**
 * La interfaz Language define un contrato para obtener mensajes en un idioma específico.
 * Cada clase que implemente esta interfaz debe proporcionar la lógica para obtener mensajes.
 */
public interface Language {
    /**
     * Obtiene un mensaje correspondiente a la clave proporcionada en un idioma específico.
     * @param  Key La clave del mensaje a obtener
     * @return El mensaje correspondiente a la clave en el idioma implementado
     */
    String getMessage(String Key);
}
