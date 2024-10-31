package edu.katheryn_azano.ordenamientos;

public class OrdenamientoInsercion {
    public void incersion (int arreglo2 [], int n){
        int i, j, aux;
        for (i=1; i<n; i++){
            aux = arreglo2[i];
            j = i - 1;
            while (j>=0 && arreglo2 [j]>aux){
                arreglo2[j+1]=arreglo2[j];
                j=j-1;
            }
            arreglo2[j+1]=aux;
        }
        System.out.println(arreglo2[i]);
        mostrarOrdenInsercion(arreglo2);
    }

    public void mostrarOrdenInsercion(int a[]){
        for (int i = 0; i <a.length; i++){
            System.out.println("["+a[i] +"]");
        }
    }
}
