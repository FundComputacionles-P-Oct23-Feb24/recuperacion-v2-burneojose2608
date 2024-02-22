/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author USUARIO
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        int numerador = 0;
        int denominador = 0;
        double suma = obtenerSuma(numerador, denominador);

        System.out.printf("La suma de todos los valores es: %.2f \n",
                suma);
    }

    public static double obtenerSuma(int numerador, int denominador) {
        double suma = 0;
        double calcular;
        for (int i = 1; i < 7; i++) {
            numerador = numerador + 2;
            denominador = denominador + 7;
            calcular = i * numerador;
            calcular = calcular / denominador;
            suma = suma + calcular;

            System.out.printf("%d * %d / %d = %.1f \n", i,
                    numerador, denominador, calcular);
        }

        return suma;
    }
}
