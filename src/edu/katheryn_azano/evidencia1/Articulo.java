package edu.katheryn_azano.evidencia1;

public class Articulo {
    String nombre;
    float precio;

    public Articulo(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "articulo{" +
                "nombre='" + nombre + '\'' +
                ", precio= $" + precio +
                '}';
    }
}