/* scrivere un programma che rimuova un elemento specifico dall'array, spostando gli
elementi rimanenti, se necessario, in modo che non rimangano spazi vuoti tra i diversi valori
 */

import java.util.Arrays;

class ArrayRemoveElement {
    public static void main(String[] args) {
        int[] arr = {10, 1, 10, 10, 7, 10, 10, 10, 10, 10, 2, 5, 10, 10};
        int n = 10;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == n) || (arr[i - 1] == n)) { //controlla che il valore corrente o il precedente siano uguali all'elemento dal cancellare
                if (arr[i] != arr[0] && arr[i - 1] == n) { //controlla che non sia in prima posizione e che il valore precedente sia uguale a quello da cancellare
                    i--;
                }
                for (int j = i; j < arr.length - 1; j++) { //da quel valore in poi sposta tutti i valori di un posto a sx e lascia l'ultimo a zero
                    arr[j] = arr[j + 1];
                    arr[j + 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
