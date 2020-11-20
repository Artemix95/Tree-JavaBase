/* scrivere un programma che rimuova un elemento specifico dall'array, spostando gli
elementi rimanenti, se necessario, in modo che non rimangano spazi vuoti tra i diversi valori
 */

import java.util.Arrays;

class ArrayRemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 8, 4, 9, 11, 8, 10};
        int n = 10;
        int index = 0;

        //elimino il valore
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                arr[i] = 0;
                index = i;
                break;
            }
        }
        //sposto tutti gli altri valori di un posto
        for (int i = index; i < arr.length - 1; i++) {
            arr[index] = arr[index + 1];
        }
        System.out.println(Arrays.toString(arr));

    }
}
