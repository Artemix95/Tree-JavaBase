/*scrivere un programma che calcoli la media dei valori di un array*/

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = 5;
        int[] array = new int[arraySize];

        System.out.println("Inserire 5 numeri interi: ");
        for (int i = 0; i < arraySize; i++) {
            while(!sc.hasNextInt()) sc.next(); //fa in modo che vengano ignorati tutti i caratteri che non sono interi
            array[i] = sc.nextInt();
        }

        //scorre tutti gli elementi dell'array e li somma
        int sum=0;
        for (int j : array) {
            sum += j;
        }
        double media=(double)sum/array.length;
        System.out.printf(String.format("%.2f", media)); //mostra solo 2 valori dopo la virgola
    }
}
