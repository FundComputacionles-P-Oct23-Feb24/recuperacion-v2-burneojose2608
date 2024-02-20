/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        int limite ;
        double bacalao;
        double camaron;
        double costo_bacalo;
        double costo_camaron;
        String nombre;
        System.out.println("ingrese la cantidad de pesadores");
        limite = entrada.nextInt();
        entrada.nextLine();
        while (contador <= limite) {
            System.out.println("ingrese el nombre del pescador");
            nombre = entrada.nextLine();
            System.out.println("ingrese el numero de libras de camaron");
            camaron = entrada.nextDouble();
            System.out.println("ingrese el numer de libras de bacalao");
            bacalao = entrada.nextDouble();
            costo_camaron = camaron * 1.1;
            costo_bacalo = bacalao * 1.2;
            System.out.printf("Pescador :%s\n Libras de camaron  %.1f - "
                 + "costo: $ %.1f\n Libras de bacalao %.1f - costo : $ %.1f\n ",
                     nombre, camaron, costo_camaron,
                    bacalao, costo_bacalo);
            entrada.nextLine();
            String valor = valores(costo_camaron, costo_bacalo);
     
            contador = contador + 1;
        }
    }

    public static String valores(double costo_camaron, double costo_bacalo) {
        String cadena = "";
        double total;
        total = costo_camaron * costo_bacalo;
        cadena = String.format("%s Total a pagar al pescador. $  %.2f\n",
                cadena, total);

        System.out.printf("%s", cadena);
        return cadena;
    }

}
