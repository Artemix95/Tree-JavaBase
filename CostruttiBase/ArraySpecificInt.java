/*scrivere un programma che controlli se un valore è presente nell'array*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySpecificInt {
    public static void main(String[] args) {

        //Inizializzo e riempio a caso un array
        Random rnd = new Random();
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(50);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //chiedo valore da cercare
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire il valore da cercare: ");
        int n = sc.nextInt();

        int searchResult = Arrays.binarySearch(array, n);

        // il metodo binarySearch restituisce l'indice dell'array, quindi
        // se restituisce un numero negativo il valore non è presente
        if (searchResult >= 0) {
            System.out.println("Il valore è presente in posizione: " + searchResult);
        } else {
            System.out.println("Il valore non è presente");
        }
    }
}
