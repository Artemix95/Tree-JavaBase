package biciclette;

public class Main {
    public static void main(String[] args) {
        Tandem bici1 = new Tandem(true, true);
        System.out.println(bici1.getLight());
        bici1.lightOnOff();
        System.out.println(bici1.getLight());

        Tandem bici2 = new Tandem(true, false);
        if (!bici2.lightOnOff()){
            System.out.println("La bici non ha la luce");
        } else {
            bici2.lightOnOff();
        }
        if (bici1.ringBell()) {
            System.out.println("Il campanello sta suonando");
        } else {
            System.out.println("Non c'è il campanello");
        }

        BiciCorsa corsa = new BiciCorsa(4, "Tarmac SL7");
        System.out.println();
        corsa.stampaSepcifiche();
        System.out.println();
        bici1.stampaSpecifiche();
    }
}
