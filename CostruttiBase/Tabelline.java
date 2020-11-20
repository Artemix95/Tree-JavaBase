/*scrivere un programma che calcoli le tabelline di tutti i valori da 1 a n*/

import java.util.Scanner;

public class Tabelline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire il numero delle tabelline da mostrare: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Tabellina del "+i);
            for (int j=1; j<=10; j++) {
                System.out.println(i + " x "+ j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
