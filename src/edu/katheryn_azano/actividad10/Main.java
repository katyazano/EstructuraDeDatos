package edu.katheryn_azano.actividad10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++){
            int numRandom = random.nextInt(1000);
            list.add(numRandom);
        }

        List<Integer> listaClonada = new ArrayList<>(list);

        int promedio = sacarPromedio(listaClonada);
        System.out.println("El promedio es: " + promedio);

        listaClonada.removeIf(numero -> numero > promedio);

        long inicio = System.currentTimeMillis();
        insercion(listaClonada);
        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;
        System.out.println("\nMetodo de inserción: ");
        System.out.println("Tiempo: " + tiempo);
        System.out.println("Lista después de eliminar numeros mayores al promedio: " + listaClonada);

        List<Integer> lista2 = new ArrayList<>(list);

        long inicio2 = System.currentTimeMillis();
        shell(lista2);
        long fin2 = System.currentTimeMillis();
        long tiempo2 = fin2 - inicio2;
        System.out.println("\nMetodo Shell: ");
        System.out.println("Tiempo: " + tiempo2);
        lista2.removeIf(numero -> numero >= promedio);
        System.out.println("Lista después de eliminar numeros menores o iguales al promedio: " + lista2);

    }

    public static void insercion(List<Integer> listaClonada){
        int i, j, aux;
        for (i=1; i< listaClonada.size(); i++){
            aux = listaClonada.get(i);
            j = i - 1;
            while (j>=0 && listaClonada.get(j) >aux){
                listaClonada.set(j + 1, listaClonada.get(j));
                j=j-1;
            }
            listaClonada.set(j + 1, aux);
        }
    }

    public static int sacarPromedio(List<Integer> listaClonada){
        int suma = 0;
        for (int numero : listaClonada){
            suma += numero;
        }

        return suma / listaClonada.size();
    }

    public static void shell(List<Integer> lista2){
        int n = lista2.size();

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = lista2.get(i);
                int j;

                for (j = i; j >= gap && lista2.get(j - gap) < temp; j -= gap) {
                    lista2.set(j, lista2.get(j - gap));
                }

                lista2.set(j, temp);
            }
        }
    }
}
