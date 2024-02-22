/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre"};
        int[] ventaNumeroTelevisores = {100, 130, 150, 200, 100, 190, 200, 200,
            300, 100, 400, 1000};
            int[] ventaNumeroCelulares = {20, 30, 22, 50, 100, 35, 90, 80, 10,
            40, 50, 60};

        for (int i = 0; i < meses.length; i++) {
            if (ventaNumeroCelulares[i] <= 35) {
                String reporte = obtenerReporte(meses[i], ventaNumeroTelevisores[i],
                        ventaNumeroCelulares[i]);
                System.out.printf("%s",reporte);
            }
        }
    }

    public static String obtenerReporte(String mes, int numTelevisores,
            int numCelulares) {
        String acumulador;
        acumulador = String.format("%s: televisores %d - celulares %d\n",
                 mes, numTelevisores, numCelulares);

        return acumulador;
    }

}
