/*creare e inizializzare un array di 5 elementi e stamparne gli elementi*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //array riempito dall'utente
        Scanner sc = new Scanner(System.in);
        int arraySize = 5;
        int[] array = new int[arraySize];

        System.out.println("Inserire 5 numeri interi: ");
        for (int i = 0; i < arraySize; i++) {
            while(!sc.hasNextInt()) sc.next(); //fa in modo che vengano ignorati tutti i caratteri che non sono interi
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array riempito dall'utente: " + Arrays.toString(array));


        //array generato casualmente
        int[] array2 = new int[5];
        Random r = new Random();
        for (int i=0; i<array2.length;i++) {
            array2[i] = r.nextInt(201)-100; //numeri casuali da -100 a 100
        }

        System.out.println("Array generato a caso: " + Arrays.toString(array2));
    }
}
