package edu.katheryn_azano.EjerciciosClase;

import java.util.LinkedList;
import java.util.Queue;

public class MetodoCola1 {
    public static void main(String[] args) {
        Queue <Integer> cola = new LinkedList<Integer>();
        cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);
        cola.add(50);
        cola.add(60);

        System.out.println("Elemento que esta al inicio de la cola: " +cola.peek());
        int tamano = cola.size();
        System.out.println("Vaciando los elementos de la cola");
        //cola.clear();
            while (!cola.isEmpty()){
                System.out.println("Los elementos de la cola: "+cola.remove());
            }
    }
}
