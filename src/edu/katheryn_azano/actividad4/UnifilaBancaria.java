package edu.katheryn_azano.actividad4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UnifilaBancaria {
    static Scanner scanner = new Scanner(System.in);

    static Queue<String> colaCuenta = new LinkedList<String>();
    static Queue<String> colaVentanilla = new LinkedList<String>();
    static Queue<String> colaEjecutivo = new LinkedList<String>();

    static Queue<String> unifila = new LinkedList<String>();

    public static void showMenu(){
        System.out.println("""
                \nBienvenido\s
                Seleccione la acción que desea realizar:
                1. Registrar a una persona
                2. Abrir una cuenta
                3. Ir a ventanilla
                4. Atención de ejecutivos
                5. Atender en apertura de cuentas
                6. Atender en ventanilla
                7. Atender en ejecutivos
                8. Mostrar filas
                9. Salir
                """);
    }
    public static void launchApp(){
        int opcion;
        do {
            showMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    unifila.add(nombre);
                    System.out.println("Estimad@ " + nombre +", se ha registrado en la unifila");
                    break;

                case 2:
                    formar(colaCuenta, "apertura de cuenta");
                    break;

                case 3:
                    formar(colaVentanilla, "ventanilla");
                    break;

                case 4:
                    formar(colaEjecutivo, "hablar con un ejecutivo");
                    break;

                case 5:
                    atender(colaCuenta, "apertura de cuenta");
                    break;

                case 6:
                    atender(colaVentanilla, "ventanilla");
                    break;

                case 7:
                    atender(colaEjecutivo, "hablar con un ejecutivo");
                    break;

                case 8:
                    System.out.println("Unifila: "+unifila);
                    System.out.println("Apertura de cuentas: "+colaCuenta);
                    System.out.println("Ventanilla: "+colaVentanilla);
                    System.out.println("Ejecutivos: "+colaEjecutivo);
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Hubo un error inesperado");
                    break;
            }
        }while (opcion != 9);
    }
    public static void formar(Queue<String> cola, String act){
        if (unifila.isEmpty()){
            System.out.println("No hay personas en espera");
        } else {
            String persona = unifila.poll();
            cola.add(persona);
            System.out.println(persona + " se ha formado para " + act);
        }
    }

    public static void atender(Queue<String> cola, String act){
        if (cola.isEmpty()){
            System.out.println("No hay personas en espera");
        } else {
            String persona = cola.poll();
            System.out.println("Atendiendo a " +persona+ " en " +act);
        }
    }
}
