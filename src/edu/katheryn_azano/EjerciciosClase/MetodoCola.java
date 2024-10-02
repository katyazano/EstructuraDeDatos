package edu.katheryn_azano.EjerciciosClase;

import javax.swing.JOptionPane;
import java.util.Stack;

public class MetodoCola {
    public static void main(String[] args) {
        Stack <String> myStack = new Stack<>();
        int opcion = 0;

        do{
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, """
                1. empujar un mes
                2. sacar un mes
                3. cuál es el mes en el tope o cima de la pila
                4. eliminar un mes
                5. mostrar si hay meses en la pila
                6. si la pila está vacía
                7. muestre el tamaño de la pila
                8. salir""", "Menu de inicio: ", JOptionPane.QUESTION_MESSAGE));
        switch (opcion) {
            case 1:
                String mes = JOptionPane.showInputDialog("Ingrese el nombre del mes:");
                if (mes != null && !mes.trim().isEmpty()) {
                    myStack.push(mes);
                    JOptionPane.showMessageDialog(null, "Mes empujado a la pila.");
                } else {
                    JOptionPane.showMessageDialog(null, "Mes no válido.");
                }
                break;
            
            case 2:
                if (!myStack.isEmpty()) {
                    String mesDesplazado = myStack.pop();
                    JOptionPane.showMessageDialog(null, "Mes sacado de la pila: " + mesDesplazado);
                } else {
                    JOptionPane.showMessageDialog(null, "La pila está vacía.");
                }
                break;

            case 3:
                if (!myStack.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El mes en la cima de la pila es: " + myStack.peek());
                } else {
                    JOptionPane.showMessageDialog(null, "La pila está vacía.");
                }
                break;

            case 4:
                if (!myStack.isEmpty()) {
                    String mesAEliminar = JOptionPane.showInputDialog("Ingrese el nombre del mes que desea eliminar:");
                    if (myStack.contains(mesAEliminar)) {
                        myStack.remove(mesAEliminar);
                        JOptionPane.showMessageDialog(null, "Mes eliminado de la pila: " + mesAEliminar);
                    } else {
                        JOptionPane.showMessageDialog(null, "El mes no se encuentra en la pila.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La pila está vacía.");
                }
                break;

            case 5:
                if (!myStack.isEmpty()) {
                    System.out.println("Los elementos actuales de la pila son:");
                    System.out.println(myStack);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay elementos en la pila.");
                }
                break;

            case 6:
                if (myStack.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "La pila está vacía.");
                } else {
                    JOptionPane.showMessageDialog(null, "La pila no está vacía.");
                }
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "El tamaño de la pila es: " + myStack.size());
                break;

            case 8:
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                break;
        }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
            }
        } while (opcion != 8);
    }
}
