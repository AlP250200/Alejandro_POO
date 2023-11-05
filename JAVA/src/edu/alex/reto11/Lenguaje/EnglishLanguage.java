package edu.alex.reto11.Lenguaje;
/**
 * La clase EnglishLanguage implementa la interfaz Language y proporciona traducciones en inglés para una serie de claves.
 */
public class EnglishLanguage implements Language{
    /**
     * Obtiene un mensaje o traducción en inglés según la clave proporcionada.
     * @param key La clave que identifica el mensaje o traducción.
     * @return El mensaje o traducción en inglés correspondiente a la clave especificada.
     */
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Welcome to the Arithmetic Calculator";
            case "select_option":
                return "Select an option:";
            case "invalid_option":
                return "Invalid option. Please try again.";
            case "continue":
                return "Do you want to continue (s/o)?: ";
            case "exit":
                return "Exiting...";
            case "enter_first_number":
                return "Enter the first number: ";
            case "enter_second_number":
                return "Enter the second number: ";
            case "enter_base":
                return " Enter the base number of the root";
            case "enter_raiz":
                return "Give me the number from which we will take root ";
            case "enter_base_power":
                return "Enter the base number:";
            case "enter_exponent":
                return "Enter the exponent: ";
            case "enter_dividend":
                return "Enter the dividend: ";
            case "enter_divisor":
                return "Enter the divisor: ";
            case "enter_modulo_number":
                return "Enter the number for modulo calculation: ";
            case "enter_modulo_divisor":
                return "Enter the divisor for modulo calculation: ";
            case "enter_logarithm_number":
                return "Enter the number for logarithm calculation: ";
            case "enter_logarithm_base":
                return "Enter the base for logarithm calculation: ";
            case "result":
                return "Result: ";
            case "menu":
                return "Menu:\n1. Sum\n2. Subtract\n3. Multiply\n4. Power\n5. Divide\n6. Modulo\n7. Logarithm\n8. Square Root\n0. Exit\nSelect an option: ";
            case "operation_description":
                return "Operation: ";
            case  "is":
                return  "is";
            case "Adding":
                return "Adding";
            case "Subtracting":
                return "Subtracting";
            case "Dividing":
                return "Dividing";
            case  "Multiplying":
                return "Multiplying";
            case "Calculating the modulus of":
                return "Calculating the modulus of";
            case "Calculating the logarithm of: ":
                return  "Calculating the logarithm of:  ";
            case "Raising":
                return "Raising: ";
            case "Calculating the square root of: ":
                return "Calculating the square root of: ";
            default:
                return "Message not found";
        }
    }
}
