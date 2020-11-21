package caldaia;

public class Main {
    public static void main(String[] args) {
        Caldaia caldaia1 = new Caldaia();

        System.out.println(caldaia1.getStatoCaldaia());
        caldaia1.stampaStatoCaldaia();

        caldaia1.accendi();
        System.out.println(caldaia1.getStatoCaldaia());
        caldaia1.stampaStatoCaldaia();


        caldaia1.aumentaTemp();
        System.out.println(caldaia1.getTempAcqua());

        caldaia1.decrementaTemp();
        System.out.println(caldaia1.getTempAcqua());

        caldaia1.aumentaTemp(33);
        System.out.println(caldaia1.getTempAcqua()); //non supera i 55 gradi
        caldaia1.decrementaTemp(40);

        caldaia1.spegni(); //se non viene riaccesa non sale la temperatura
        System.out.println(caldaia1.getTempAcqua()); //non va sotto i 25 gradi
        caldaia1.aumentaTemp(10.2);
        System.out.println(caldaia1.getTempAcqua());
        caldaia1.decrementaTemp(10.4);
        System.out.println(caldaia1.getTempAcqua());
        caldaia1.stampaStatoCaldaia();


        caldaia1.accendi();
        caldaia1.stampaStatoCaldaia();
        caldaia1.setTemp(45.8);
        System.out.println(caldaia1.getTempAcqua());

    }
}
