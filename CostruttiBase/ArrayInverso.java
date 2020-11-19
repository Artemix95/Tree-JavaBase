/*creare un array di interi, inizializzarlo a piacere e stampare tutti gli
elementi dell'array al contrario
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = 5;
        int[] array = new int[arraySize];

        //inizializza array con valori inseriti dall'utente
        System.out.println("Inserire 5 numeri interi: ");
        for (int i = 0; i < arraySize; i++) {
            while (!sc.hasNextInt()) sc.next(); //fa in modo che vengano ignorati tutti i caratteri che non sono interi
            array[i] = sc.nextInt();
        }
        sc.close();

        //inverte gli elementi dell'array
        for (int i = 0, j = array.length - 1; i < array.length / 2 && j > array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));

    }
}
