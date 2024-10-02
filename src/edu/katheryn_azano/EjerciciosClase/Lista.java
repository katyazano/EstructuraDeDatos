package edu.katheryn_azano.EjerciciosClase;

//Mandaremos a llamar los nodos creados en clase nodo
public class Lista {
    protected Nodos inicio, fin;
    
    //constructor, solo inicia los punteros
    public Lista(){ 
        inicio = null;
        fin = null;
    }

    /**
     * metodo para saber si lista está vacia
     */
    public boolean Estavacia(){
        if (inicio==null) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * metodo para agregar nodo al inicio de la lista
     */
    public void agregarAlInicio (int elemento){
        //crear nodo
        inicio = new Nodos(elemento, inicio);

        if (fin==null) { //si aun no habia nodos
            fin=inicio; //apunta a inicio
        }
    }

    /**
     * metodo insertar al final
     */
    public void agregarAlFinal (int elemento){
        if (!Estavacia()) {
            fin.siguiente = new Nodos(elemento);
            fin = fin.siguiente;
        }else {
            inicio = fin = new Nodos(elemento);
        }
    }

    /**
     * metodo para mostrar datos
     */
    public void mostrarLista(){
        Nodos recorre = inicio;
        System.out.println("");
        
        while (recorre!=null) { //muestra los elementos de cada nodo
            System.out.println("["+ recorre.dato +"]"+ "==>");
            recorre=recorre.siguiente;
        }
    }

    //metodo para borrar elemento del inicio de la lista
    public int eliminarInicio(){
        int elemento = inicio.dato;
        if (inicio==fin) { 
            inicio = fin = null; 
        }else {
            inicio = inicio.siguiente; //no sean iguales los elementos
        }
        return elemento; //retornamos el elemento que eliminamos
    }

    //metodo para borrar elemento del final de la lista
    public int eliminarFinal(){
        int elemento = fin.dato;
        if (inicio==fin) { 
            inicio = fin = null; 
        // crear nodo temporal    
        }else {
            Nodos temp = inicio; //recorriendo toda la lista ¿cual sera eliminado?
            while (temp.siguiente!=fin) {
                temp = temp.siguiente;
            }
            fin = temp; //nodo fin apunta a temporal
            fin.siguiente = null; // nodo fin apunta a siguiente pone en nulo
        }
        return elemento; //retornamos el elemento que eliminamos
    }

    //metodo para eliminar elemento de la lista
    public void Eliminar(int elemento){
        if (!Estavacia()) {
            if (inicio == fin && elemento == inicio.dato) {
                inicio = fin = null;
            }else{
                if (elemento == inicio.dato) {
                    inicio = inicio.siguiente;
                }else{
                    Nodos anterior, temp;
                    anterior = inicio;
                    temp = inicio.siguiente;
                    //recorrer lista
                    while (temp!=null && temp.dato!=elemento) {
                        anterior = anterior.siguiente;
                        temp = temp.siguiente;
                    }
                    if (temp!=null) {
                        anterior.siguiente = temp.siguiente;
                        if (temp==fin) {
                            fin = anterior;
                        }
                    }
                }
            }
        }
    }
}