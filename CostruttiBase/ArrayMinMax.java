/*scrivere un programma che trovi e stampi il minimo e il massimo valore in un array*/

import java.util.Arrays;
import java.util.Random;

public class ArrayMinMax {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        //Metodo 1 - scorro l'array e salvo man mano il valore min e max
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println("minimo: " + min);
        System.out.println("massimo: " + max);

        //Metodo 2 - ordino l'array in modo crescente e prendo il primo e ultimo elemento
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Il valore minimo è: " + array[0]);
        System.out.println("Il valore massimo è: " + array[array.length - 1]);
    }
}
