package edu.katheryn_azano.actividad9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Objeto> list = new ArrayList<>();

        list.add(new Objeto("Juan Pérez", "2023-01-15", "12345"));
        list.add(new Objeto("Ana Gómez", "2023-02-20", "23456"));
        list.add(new Objeto("Luis Martínez", "2023-03-10", "34567"));
        list.add(new Objeto("María López", "2023-04-05", "45678"));
        list.add(new Objeto("Carlos Díaz", "2023-05-25", "56789"));
        list.add(new Objeto("Laura Sánchez", "2023-06-30", "67890"));
        list.add(new Objeto("Roberto Torres", "2023-07-18", "78901"));
        list.add(new Objeto("Isabel Ruiz", "2023-08-22", "89012"));
        list.add(new Objeto("Pedro Ramírez", "2023-09-14", "90123"));
        list.add(new Objeto("Sofía Morales", "2023-10-09", "01234"));

        menu();
    }

    public static void menu(){
        System.out.println("Elige el metodo de ordenamiento que quieres utilizar: \n" +
                "1. Brujuba \n" +
                "2. Selección");
        int metodo = scanner.nextInt();
        System.out.println("Elige el criterio de ordenamiento: " +
                "1. Nombre\n" +
                "2. Fecha\n" +
                "3. Numero");
        int criterio = scanner.nextInt();
    }

}
