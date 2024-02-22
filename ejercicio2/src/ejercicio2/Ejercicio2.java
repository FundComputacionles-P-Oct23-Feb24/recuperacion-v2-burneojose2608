/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] equipos = {
            "Barcelona", "Emelec", "Liga de Quito", "Independiente del Valle",
            "Delfin", "Macara", "Deportivo Cuenca", "Orense"};

        int[][] goles = {
            {1, 2, 2, 5}, {4, 1, 1, 4}, {8, 0, 1, 3}, {7, 1, 1, 2},
            {6, 0, 1, 2}, {5, 2, 1, 1}, {4, 0, 3, 2}, {3, 1, 2, 1}};
        for (int i = 0; i < equipos.length; i++) {
            presentarReporte(equipos[i], goles[i][0], goles[i][1], goles[i][2],
                    goles[i][3]);
        }
    }

    public static void presentarReporte(String equipo, int num1, int num2,
            int num3, int num4) {

        int totalPuntos = num1 + num2 + num3 + num4;
        System.out.printf("%s con puntos: %d %d %d %d tiene un total de "
                + "puntos de %d \n ", equipo, num1, num2, num3,
                num4, totalPuntos);

    }

}
