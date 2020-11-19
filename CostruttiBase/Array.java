/*creare e inizializzare un array di 5 elementi e stamparne gli elementi*/

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = 5;
        int[] array = new int[arraySize];

        System.out.println("Inserire 5 numeri interi: ");
        for (int i = 0; i < arraySize; i++) {
            while(!sc.hasNextInt()) sc.next(); //fa in modo che vengano ignorati tutti i caratteri che non sono interi
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
