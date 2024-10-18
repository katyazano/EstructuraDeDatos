package edu.katheryn_azano.EjerciciosClase;

public class ArbolBinario {
    NodoArbol raiz;
    public ArbolBinario(){
        raiz = null;
    }
    public void agregarNodo (int d, String nom){
        NodoArbol nuevo = new NodoArbol(d, nom);
        if (raiz == null){
            raiz = nuevo;
        } else {
            NodoArbol temp = raiz;
            NodoArbol padre;
            while (true){
                padre = temp;
                if (d<temp.dato){
                    temp=temp.nodoIzq;
                    if (temp==null){
                        padre.nodoIzq=nuevo;
                        return;
                    }
                }else {
                    temp = temp.nodoDer;
                    if (temp == null){
                        padre.nodoDer = nuevo;
                        return;
                    }
                }
            }
        }
    }
    public void inOrder(NodoArbol nr){
        if (nr != null){
            inOrder(nr.nodoIzq);
            System.out.println(nr.dato);
            inOrder(nr.nodoDer);
        }
    }

    public void preOrden(NodoArbol nr){
        if (nr != null){
            System.out.println(nr.dato);
            preOrden(nr.nodoIzq);
            preOrden(nr.nodoDer);
        }
    }

    public void postOrden(NodoArbol nr){
        if (nr != null){
            postOrden(nr.nodoIzq);
            postOrden(nr.nodoDer);
            System.out.println("\n" + nr.dato);
        }
    }

    public NodoArbol buscarNodo (int d){
        NodoArbol aux = raiz;
        while (aux.dato != d){
            if (d<aux.dato){
                aux=aux.nodoIzq;
            }else {
                aux = aux.nodoDer;
            }
            if (aux == null){
                return null;
            }
        }return aux;
    }

    public boolean estaVacio (){
        return raiz==null;
    }
}
