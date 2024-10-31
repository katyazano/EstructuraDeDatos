package edu.katheryn_azano.EjerciciosClase;

import javax.swing.*;

public class ArbolesBinario {
    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbol = new ArbolBinario();
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar nodo al arbol \n" +
                                "2. recorrido en orden \n" +
                                "3. recorrido en  pre orden \n"+
                                "4. recorrido en post orden \n"+
                                "5. busqueda de nodo \n"+
                                "6. salir", "Arboles Binarios", JOptionPane.QUESTION_MESSAGE));
                switch (opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                Ingrese el numero del Nodo
                                ""","Agregando al nodo",3));
                        nombre = JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del Nodo",
                                "Agregando nombre al nodo",3);
                        arbol.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbol.estaVacio()){
                            arbol.inOrder(arbol.raiz);
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "El arbol se encuentra vacio",
                                    "Vacio",1);
                        }
                        break;
                    case 3:
                        if(!arbol.estaVacio()){
                            arbol.preOrden(arbol.raiz);
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "El arbol se encuentra vacio",
                                    "Vacio",1);
                        }
                        break;
                    case 4:
                        if(!arbol.estaVacio()){
                            arbol.postOrden(arbol.raiz);
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "El arbol se encuentra vacio",
                                    "Vacio",1);
                        }
                        break;
                    case 5:
                        if(!arbol.estaVacio()){
                            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el numero del Nodo a buscar",
                                    "Buscando el Nodo",3));
                            if(arbol.buscarNodo(elemento)==null){
                                JOptionPane.showMessageDialog(null,
                                        "Nodo no encontrado"+JOptionPane.INFORMATION_MESSAGE);
                            }else {
                                System.out.println("Nodo encontrado "+"Su nombre es: "
                                        +arbol.buscarNodo(elemento));
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"El arbol binario esta vacio",
                                    "Vacio",1);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,
                                "Programa terminado","FIN",1);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,
                                "Opcion incorecta","Fin",1);
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error: "+ n.getMessage());
            }
        }while (opcion!=6);
    }
}
