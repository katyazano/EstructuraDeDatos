package edu.katheryn_azano.actividad6;

import java.util.Scanner;


public class InteresCompuesto {
    public static Scanner scanner = new Scanner(System.in);
    public static double cantInicial, tasa, meses, cantFinal;

    /**
     * Metodo para pedir todos los datos
     */
    public static void showMenu(){
        System.out.println("Ingrese cual es la inversión inicial: ");
        cantInicial = scanner.nextDouble();
        System.out.println("Ingrese la tasa de interés mensual en decimal: ");
        tasa = scanner.nextDouble();
        System.out.println("Ingrese el numero de meses: ");
        meses = scanner.nextDouble();
    }

    /**
     * metodo recursivo que genera el calculo del interes compuesto
     * @param cantInicial
     * @param tasa
     * @param meses
     * @return
     */
    public static double calcularIC( double cantInicial, double tasa, double meses){
        if (meses == 0){
            return cantInicial;
        } else {
            return calcularIC(cantInicial, tasa, meses - 1) * (1 + tasa);
        }
    }

    /**
     * Metodo main que ejecuta el programa
     * @param args
     */
    public static void main(String[] args) {
        showMenu();
        cantFinal = calcularIC(cantInicial, tasa, meses);
        System.out.println("La cantidad final después de " + meses + " meses es de: $" + cantFinal);
    }
}
