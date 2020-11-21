package automobile;

public class Main {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile("Fiat Punto", "AD123CD");

        System.out.println(auto1.getTarga());
        System.out.println(auto1.getModello());
        auto1.incrementaVelocità(100);
        auto1.incrementaVelocità(150);
        System.out.println(auto1.getVelocità()); //deve restare sotto 200k/h
        auto1.decrementaVelocità(50);
        auto1.decrementaVelocità(60);
        System.out.println(auto1.getVelocità()); //velocità negativa = retromarcia

        auto1.decrementaMarcia();
        System.out.println(auto1.getMarcia()); //-1 è la retromarcia

        auto1.incrementaMarcia();
        auto1.incrementaMarcia();
        auto1.incrementaMarcia();
        auto1.incrementaMarcia();
        auto1.incrementaMarcia();
        auto1.incrementaMarcia();
        auto1.incrementaMarcia();
        auto1.incrementaMarcia();
        System.out.println(auto1.getMarcia()); //marcia massima è 6

        auto1.decrementaMarcia();
        auto1.decrementaMarcia();
        System.out.println(auto1.getMarcia());



    }
}
