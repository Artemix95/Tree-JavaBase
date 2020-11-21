package automobile;

public class Automobile {
    private String modello;
    private String targa;


    private double velocità;
    private int marcia;


    public Automobile(String modello, String targa) {
        velocità = 0;
        marcia = 0;
        this.modello = modello;
        setTarga(targa); //controlla la validità della targa
    }


    public String getModello() {
        return modello;
    }

    public String getTarga() {
        return targa;
    }

    public double getVelocità() {
        return velocità;
    }


    public boolean incrementaVelocità(double velocità) {
        if (this.velocità + velocità > 200) {
            return false;
        }
        this.velocità += velocità;
        return true;
    }

    public boolean decrementaVelocità(double velocità) {
        if (this.velocità - velocità < 0) {
            return false;
        }
        this.velocità -= velocità;
        return true;
    }


    public boolean incrementaMarcia() {
        if (marcia >= 6) {
            return false;
        }
        marcia++;
        return true;
    }

    public boolean decrementaMarcia() {
        if (marcia == -1) {
            return false;
        }
        marcia--;
        return true;

    }

    public int getMarcia() {
        return marcia;
    }


    public boolean setTarga(String targa) {
        if (targa.length() != 7) {
            return false;
        }
        //controlla che primi e ultimi due siano lettere
        for (int i=0; i<targa.length();i++) {
            if (i<2 || i>4) {
                if (!Character.isLetter(targa.charAt(i))) {
                    return false;
                }
            }
            //controlla che i tre al centro siano numeri
            if (i>=2 &&i<=4) {
                if(!Character.isDigit(targa.charAt(i))) {
                    return false;
                }
            }
        }
        targa = targa.toUpperCase();
        this.targa = targa;
        return true;
    }
}
