package biciclette;

public abstract class Bicicletta {
    private int numeroRuote;
    private int velocità;


    public Bicicletta(int n) {
        this.numeroRuote = n;
        velocità = 0;
    }

    public int getNumeroRuote() {
        return numeroRuote;
    }

    public void setNumeroRuote(int numeroRuote) {
        this.numeroRuote = numeroRuote;
    }

    public int getVelocità() {
        return velocità;
    }

    public boolean accelera(int n) {
        if (n < 0) {
            return false;
        }
        velocità += n;
        return true;
    }

    public boolean rallenta(int n) {
        if ((n < 0) || (velocità - n < 0)) {
            return false;
        }
        velocità-=n;
        return true;
    }

    public void setVelocità(int velocità) {
        this.velocità = velocità;
    }
    public void stampaSpecifiche() {
        System.out.println("Numero ruote: "+getNumeroRuote());

    }
}
