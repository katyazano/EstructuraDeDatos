package edu.katheryn_azano.EjerciciosClase;


public class TorreHanoi {

    public static void main(String[] args) {

// TODO code application logic here

        TorreHanoi Hanoi = new TorreHanoi();

        Hanoi.torresHanoi(7,1, 2, 3);

    }

    public void torresHanoi (int discos, int torreOrigen, int torreAux, int torreDest){

//caso base

        if(discos==1) {

            System.out.println("Mover disco de la Torre "+ torreOrigen+ " a la torre "+ torreDest);

        } else{

//Caso recursivo

            torresHanoi(discos-1, torreOrigen, torreDest, torreAux);

            System.out.println("Mover disco de la Torre "+ torreOrigen+ " a la torre "+ torreDest);

            torresHanoi(discos-1, torreAux,torreOrigen, torreDest);

        }

    }

}