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
        double resultado;
        for (int i = 1; i <= 6; i++) {
            resultado = calcularTermino(i);

            System.out.printf(" %d Resultado %.6f\n", i, resultado);
        }
    }

    private static double calcularTermino(int n) {
        int numerador = n * 2;
        int denominador = 7 * n;
        return (double)  numerador / denominador;
    }

}
