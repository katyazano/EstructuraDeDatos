package edu.katheryn_azano.actividad9;

public class Objeto {
    String nombre;
    String fecha;
    String numero;

    public Objeto(String nombre, String fecha, String numero) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", numero=" + numero +
                '}';
    }
}
