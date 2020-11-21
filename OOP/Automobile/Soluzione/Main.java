package automobile;

public class Main {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile("Fiat Punto", "AD123CD");

        auto1.setTarga("aa456bc");
        System.out.println(auto1.getTarga());

    }
}
