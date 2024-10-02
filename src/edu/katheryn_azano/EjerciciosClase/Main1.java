package edu.katheryn_azano.EjerciciosClase;

import javax.swing.JOptionPane;

public class Main1 {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        int Opcion = 0, elem;
        do{
            try{
        Opcion=Integer.parseInt(JOptionPane.showInputDialog
        (null, """
                1. agregar un elemento al inicio de la lista
                2. agregar un elemento al final de la lista
                3. mostrar los datos de la lista
                4. eliminar elemento del inicio de la lista
                5. eliminar elemento del final de la lista
                6. eliminar un elemento en especifico de la lista
                7. salir""", "Menu de inicio: ",3));
        switch (Opcion) {
            case 1:
                try{
                    elem=Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el elemento:",
                    "insertando al inicio", 3));
                    //llamamos el metodo
                    lista1.agregarAlFinal(elem); //agrega nodo
                } catch (NumberFormatException n){
                    JOptionPane.showMessageDialog(null, "Error"+ n.getMessage());
                }                
                break;

            case 2:
                try{
                    elem=Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el elemento:",
                    "insertando al final", 3));
                    //llamamos el metodo
                    lista1.agregarAlFinal(elem); //agrega nodo
                } catch (NumberFormatException n){
                    JOptionPane.showMessageDialog(null, "Error"+ n.getMessage());
                }
                break;
            
            case 3:
            lista1.mostrarLista();
                break;
            
            case 4:
                elem = lista1.eliminarInicio();
                JOptionPane.showMessageDialog(null, "Elemento eliminado: "+ elem, "eliminando Nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 5:
                elem = lista1.eliminarFinal();
                JOptionPane.showMessageDialog(null, "Elemento eliminado: "+ elem, "eliminando Nodo del final", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 6:
                elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a eliminar", "Eliminando Nodo en especifico", JOptionPane.INFORMATION_MESSAGE));
                lista1.Eliminar(elem);
                JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elem, "Eliminando Nodo en específico", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 7:
                System.exit(0);    
            break;    

            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                break;
        }        
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
            }
        } while (Opcion !=7);
    }
}
