package edu.katheryn_azano.ordenamientos;

public class OrdenamientoSelección {
    public void ordenSeleccion (int a[]){
        for (int i=0; i<a.length-1; i++){
            int minimo = i;
            for (int j = i+1; j<a.length; j++){
                if (a[j] < a[minimo]){
                    minimo=j;
                }
            }
            int aux = a[i];
            a[i]=a[minimo];
            a[minimo]= aux;
        }
    }

    public void mostrarOrdenSeleccion(int a[]){
        for (int i = 0; i< a.length; i++){
            System.out.println(a[i]+ "\t");
        }
    }
}
