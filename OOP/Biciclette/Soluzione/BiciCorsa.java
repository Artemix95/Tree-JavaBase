package biciclette;

public class BiciCorsa extends Bicicletta {
    private int ammortizzatori;
    private String modello;

    public BiciCorsa(int numAmm, String modello) {
        super(2); //numero di ruote
        this.ammortizzatori=numAmm;
        this.modello=modello;
    }
    public int getAmmortizzatori() {
        return ammortizzatori;
    }
    public String getModello() {
        return modello;
    }
}
