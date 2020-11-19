/*Scrivere un programma che dato un carattere determini se è una vocale
o una consonante dell'alfabeto
 */

import java.util.Scanner;

public class VocaleVsConsonante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un carattere: ");
        char carattere = sc.next().charAt(0);

        //prima converto il carattere in minuscolo
        carattere = Character.toLowerCase(carattere);

        //controllo che sia nell'alfabeto
        if (carattere>='a'&&carattere<='z') {
            if (carattere=='a'||carattere=='e'||carattere=='i'||carattere=='o'||carattere=='u'){ //controllo che sia una vocale
                System.out.println("Il carattere è una vocale");
            } else {
                System.out.println("Il carattere è una consonante");
            }
        }else {
            System.out.println("Il carattere non è una lettera dell'alfabeto");
        }



    }
}
