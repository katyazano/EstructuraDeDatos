package edu.katheryn_azano.EjerciciosClase;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Sucesion de 4: " + fibonacciRecursivo(4));
        System.out.println("sucesion ciclo de 4: " + fibonacci.fibonacciCiclo(4));
    }
    public int fibonacciCiclo(int n){
        int fibo = 0, primero = 1, segundo =0;
        while (n>0){
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        return fibo;
    }

    private static int fibonacciRecursivo(int n) {
        if (n==1 || n==2){
            return 1;
        } else{
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
        }
    }
}
