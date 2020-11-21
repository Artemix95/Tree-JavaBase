/* scrivere un programma che controlli una password e definisca se è valida, le condizioni sono:
Deve essere lunga almeno 10 caratteri
Non deve contenere caratteri speciali
Deve contenere almeno 2 numeri
Deve contenere almeno una lettera maiuscola
Può contenere degli spazi
 */

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            System.out.println("Inserisci la tua password");
            password = sc.nextLine();

            if (!isValid(password)) {
                System.out.println("Password non valida");
            } else {
                System.out.println("Password Accettata");
            }

        }while(isValid(password)!=true);

    }

    //restituisce true se il carattere è un numero intero
    public static boolean isNumber(char carattere) {
        boolean result = false;
        if (carattere >= '0' && carattere <= '9') {
            result = true;
        }
        return result;
    }

    //restituisce true ss è una lettera è minuscola
    public static boolean isLetterLowerCase(char carattere) {
        return carattere >= 'a' && carattere <= 'z';
    }

    //restituisce true se è una lettera è maiuscola
    public static boolean isLettereUpperCase(char carattere) {
        return carattere >= 'A' && carattere <= 'Z';
    }


    //ritorna true se la password è valida
    public static boolean isValid(String string) {

        int passwordSize = 10;
        int leastUpperCase = 1;
        int leastDigits = 2;

        int countUpperCase = 0;
        int countDigits = 0;
        int countSpecial=0;
        if (string.length() >= passwordSize) {
            for (int i = 0; i < string.length(); i++) {
                if (isLettereUpperCase(string.charAt(i))) { //conta le lettere maiuscole
                    countUpperCase++;
                }
                if (isNumber(string.charAt(i))) { //conta i numeri
                    countDigits++;
                }
                if (isSpecial(string.charAt(i))){ //conta i caratteri speciali
                    countSpecial++;
                }
            }
        }
        return (countUpperCase >= leastUpperCase) && (countDigits >= leastDigits)&&(countSpecial==0);
    }

    //ritorna true se il carattere è un carattere speciale
    public static boolean isSpecial(char carattere) {
        return !isLetterLowerCase(carattere) && !isLettereUpperCase(carattere) && !isNumber(carattere) && carattere != ' ';
    }


}
