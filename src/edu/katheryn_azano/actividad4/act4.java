package edu.katheryn_azano.actividad4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class act4 {
    static Scanner scanner = new Scanner(System.in);
    static Queue<String> cola1 = new LinkedList<String>();
    public static void showMenu(){
        System.out.println("""
                Bienvenido\s
                Seleccione la acción que desea realizar:
                1. Abrir una cuenta
                2. Ir a ventanilla
                3. Atención de ejecutivos
                4. Salir
                """);
    }
    public static void launchApp(){
        do {
            showMenu();
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    abrirCuenta();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

            }
        }while (true);
    }
    public static void abrirCuenta(){
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        cola1.add(nombre);
    }
}
