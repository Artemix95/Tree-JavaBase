package biciclette;

public class MountainBike extends Bicicletta {
    private int marcia;
    private String colore;

    public MountainBike(String colore) {
        super(2);
        marcia=0;
        this.colore=colore;
    }
    public int getMarcia() {
        return marcia;
    }
    public String getColore() {
        return colore;
    }
    public boolean cambiaMarcia(int marcia) {
        if ((marcia<0)||(marcia>5)) {
            return false;
        }
        this.marcia=marcia;
        return true;
    }
}
