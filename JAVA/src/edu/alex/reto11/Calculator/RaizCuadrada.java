package edu.alex.reto11.Calculator;

public class RaizCuadrada extends Potencia{

    @Override
    public double calcular(double num1, double num2) {
        double resultado = 0;
        double base =1;
        while (true)
        {
            resultado=super.calcular(base,num2);
            if(resultado>num1){
                base --;
                break;
            }
            base ++;
        }

        return base;
    }
    /**
     * Obtiene el símbolo representativo de la operación.
     *
     * @return Cadena de texto que representa el símbolo de la raíz cuadrada, que es "sqrt".
            */
    @Override
    public String getSimbolo() {
        return "sqrt";
    }
}
