package edu.katheryn_azano.ordenamientos;

public class OrdenamientoBurbuja {
    public void ordenBurbuja (int arreglo[]){

        int aux;
        boolean intercambio = false;

        while (true){
            intercambio = false;

            for (int i = 0; i < arreglo.length; i++) {
                if(arreglo[i] < arreglo[i-1]){
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i-1];
                    arreglo[i-1] = aux;
                    intercambio = true;
                }
            }
            if (intercambio == false){
                break;
            }
        }
    }

    public void mostrarOrdenBurbuja(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + "\t");
        }
    }

}
