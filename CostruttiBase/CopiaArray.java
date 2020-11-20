/*scrivere un programma che dato un array copi elemento per elemento in un altro array*/

import java.util.Arrays;
import java.util.Random;

public class CopiaArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[60];
        for (int i=0;i<array.length;i++) {
            array[i] = rnd.nextInt(60);
        }
        System.out.println(Arrays.toString(array));

        int[] copyArray = Arrays.copyOf(array, 60);

        System.out.println(Arrays.toString(copyArray));

    }
}
