package edu.alex.reto12.Idioma;
/**
 * La clase SpanishLanguage implementa la interfaz Language y proporciona traducciones en español para una serie de claves.
 */
public class SpanishLanguage  implements Language{
    /**
     * Obtiene un mensaje o traducción en español según la clave proporcionada.
     * @param key La clave que identifica el mensaje o traducción.
     * @return El mensaje o traducción en español correspondiente a la clave especificada.
     */
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Bienvenido a la Calculadora Aritmética";
            case "select_option":
                return "Seleccione una opción:";
            case "invalid_option":
                return "Opción no válida. Por favor, inténtelo de nuevo.";
            case "continue":
                return "¿Desea continuar (s/o)?: ";
            case "exit":
                return "Saliendo...";
            case "enter_first_number":
                return "Ingrese el primer número: ";
            case "enter_second_number":
                return "Ingrese el segundo número: ";
            case "enter_raiz":
                return "Ingrese el número base para la raiz: ";
            case "enter_base":
                return "Dame el número al cual le sacaremos raíz: ";
            case "enter_base_power":
                return "Ingresa la base";
            case "enter_exponent":
                return "Ingrese el exponente: ";
            case "enter_dividend":
                return "Ingrese el dividendo: ";
            case "enter_divisor":
                return "Ingrese el divisor: ";
            case "enter_modulo_number":
                return "Ingrese el número para el cálculo del módulo: ";
            case "enter_modulo_divisor":
                return "Ingrese el divisor para el cálculo del módulo: ";
            case "enter_logarithm_number":
                return "Ingrese el número para el logaritmo: ";
            case "enter_logarithm_base":
                return "Ingrese la base del logaritmo: ";
            case "result":
                return "Resultado: ";
            case "menu":
                return "Menú:\n1. Suma\n2. Resta\n3. Multiplicación\n4. Potencia\n5. División\n6. Módulo\n7. Logaritmo\n8. Raiz Cuadrada\n0. Salir\nSeleccione una opción: ";
            case "operation_description":
                return "Operación: ";
            case  "is":
                return  "es";
            case "Adding":
                return "Sumando";
            case "Subtracting":
                return "Restando";
            case "Dividing":
                return "Dividiendo";
            case  "Multiplying":
                return "Multiplicando";
            case "Calculating the modulus of":
                return "Calculando el modulo de: ";
            case "Calculating the logarithm of: ":
                return  "Calculando el logaritmo de: ";
            case "Raising":
                return "Elevando: ";
            case "Calculating the square root of: ":
                return "Calculando la raiz cuadrada de: ";
            case "Do you want to see the arithmetic operations performed so far? (s/S):":
                return  "¿Desea ver las operaciones aritméticas realizadas hasta ahora? (s/S)";
            default:
                return "Mensaje no encontrado";
        }
    }

}
