package caldaia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caldaia caldaia = new Caldaia();

        String comando = "";
        System.out.println("Accendi la caldaia (ON)");
        System.out.println("Spegni la caldaia (OFF)");
        System.out.println("Imposta la temperatura (SET)");
        System.out.println("Vedi la temperatura corrente (GET)");
        System.out.println("Controlla lo stato della caldaia (STATO)");
        System.out.println("ESC per uscire");


        while (!comando.equals("ESC")) {

            Scanner sc = new Scanner(System.in);

            comando = sc.nextLine();

            comando = comando.toUpperCase();

            switch (comando) {
                case "ON":
                    caldaia.accendi();
                    System.out.println("La caldaia è accesa");

                    break;
                case "OFF":
                    caldaia.spegni();
                    System.out.println("La caldaia è spenta");

                    break;
                case "SET":
                    System.out.println("Inserire la temperatura desiderata: ");

                    double set = Double.parseDouble(sc.nextLine());
                    if (caldaia.setTemp(set)) {
                        System.out.println("Temperatura impostata");
                    } else {
                        System.out.println("Non è possibile settare la temperatura");
                    }

                    break;
                case "GET":
                    System.out.println(caldaia.getTempAcqua());
                    break;

                case "STATO":
                    caldaia.stampaStatoCaldaia();
                    break;

                case "ESC":
                    sc.close();
            }
        }


    }
}
