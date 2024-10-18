package edu.katheryn_azano.EjerciciosClase;

public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol nodoIzq, nodoDer;

    public NodoArbol(int d, String nom) {
        this.dato = d;
        this.nombre = nom;
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    @Override
    public String toString() {
        return nombre + "El dato es: " +dato;
    }
}
