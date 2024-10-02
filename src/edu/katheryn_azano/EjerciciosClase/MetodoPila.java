package edu.katheryn_azano.EjerciciosClase;

import java.util.Stack;

public class MetodoPila {
    public static void main(String[] args) {
        Stack Pila = new Stack();
        Pila.push(5);
        Pila.push(15);
        Pila.push(7);
        Pila.push(0);
        Pila.push(1000);

        System.out.println ("¿LA PILA ESTA VALIA? " + Pila.isEmpty());
        System.out.println ("TAMAÑO DE LA PILA ES " + Pila.size()); 
        System.out.println ("LA CIMA DE LA PILA ES;" + Pila.peek());
        System.out.println ("SACANDO UN ELEMNTO DE LA PILA" + Pila.pop());
        System.out.println("SACANDO UN ELENTO DE LA PILA" + Pila.pop());
        System.out.println ("TAMAÑO DE LA PILA ES = >" + Pila.size());
        System.out.println ("SACANDO UN ELEMNTO DE LA PILA" + Pila.pop());
        System.out.println ("LLA PILA ESTA VALIA? " + Pila.isEmpty());
    }
}