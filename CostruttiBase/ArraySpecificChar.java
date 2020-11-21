/*scrivere un programma che controlli se un determinato carattere è presente in un array*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySpecificChar {
    public static void main(String[] args) {

        Random rnd = new Random();
        char[] array = new char[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ('a' + rnd.nextInt(26)); //caratteri random
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire la lettera da cercare: ");
        char n = sc.next().charAt(0);

        int searchResult = Arrays.binarySearch(array, n);

        if (searchResult >= 0) {
            System.out.println("Il valore è presente in posizione: " + searchResult);
        } else {
            System.out.println("Il valore non è presente");
        }

    }
}
