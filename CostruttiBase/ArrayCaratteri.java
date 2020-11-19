/*Dato un array di caratteri, stampare l'array come una stringa compatta*/


import java.util.Arrays;
import java.util.Scanner;

public class ArrayCaratteri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire la lunghezza della parola: ");
        int wordSize = sc.nextInt();
        char[] parola = new char[wordSize];

        System.out.println("Inserire le lettere della parola");
        for (int i=0; i<wordSize; i++) {
            parola[i] = sc.next().charAt(0);
        }

        for (int i=0; i<parola.length;i++) {
            System.out.print(parola[i]);
        }

    }
}
