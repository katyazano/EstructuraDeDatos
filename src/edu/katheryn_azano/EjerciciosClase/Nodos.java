package edu.katheryn_azano.EjerciciosClase;

//primero creamos nuetros nodos necesarios
public class Nodos {
    public int dato; //puntero enlace
    public Nodos siguiente; 

//contructor para insertar al final    
    public Nodos (int d){ //un nodo al final
        this.dato= d;
        this.siguiente=null;
    }

//constructor para insertar al inicio LISTA    
    public Nodos (int d, Nodos n){ //dos parametros Dato y un puntero hacia nodo
        dato = d;
        siguiente = n;
    }
}
