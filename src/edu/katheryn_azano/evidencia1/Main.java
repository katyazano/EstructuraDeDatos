package edu.katheryn_azano.evidencia1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Articulo> listaArticulos = new LinkedList<>();

        listaArticulos.add(new Articulo("Laptop", 15000));
        listaArticulos.add(new Articulo("Teléfono", 8000));
        listaArticulos.add(new Articulo("Televisión", 12000));
        listaArticulos.add(new Articulo("Teclado", 500));
        listaArticulos.add(new Articulo("Monitor", 4500));
        listaArticulos.add(new Articulo("Reloj", 2500));
        listaArticulos.add(new Articulo("Audífonos", 1200));
        listaArticulos.add(new Articulo("Tablet", 6000));
        listaArticulos.add(new Articulo("Impresora", 3000));

        Stack<Articulo> pilaArticulos = new Stack<>();
        Iterator<Articulo> iteradorLista = listaArticulos.iterator();

        System.out.println("Elementos en lista enlazada: ");
        while (iteradorLista.hasNext()) {
            Articulo articulo = iteradorLista.next();
            System.out.println(articulo.toString());
            pilaArticulos.push(articulo);
        }

        System.out.println("\nElementos en la pila: ");
        while (!pilaArticulos.isEmpty()) {
            Articulo articulo = pilaArticulos.pop(); // Remover el artículo
            System.out.println(articulo.toString());
        }

        System.out.println("\nLa pila ha quedado vacía.");

        PriorityQueue<Articulo> colaPrioridad = new PriorityQueue<>(
                (a1, a2) -> Float.compare(a1.getPrecio(), a2.getPrecio())  // Comparar por precio
        );

        for (Articulo articulo : listaArticulos) {
            colaPrioridad.add(articulo);  // Agregar a la cola de prioridad
        }

        // Mostrar y vaciar la cola de prioridad
        System.out.println("\nElementos en la cola de prioridad (ordenados por precio):");
        while (!colaPrioridad.isEmpty()) {
            Articulo articulo = colaPrioridad.poll();  // Remover el artículo de la cola
            System.out.println(articulo.toString());
        }
    }
}
