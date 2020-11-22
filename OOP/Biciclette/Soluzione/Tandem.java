package biciclette;

public class Tandem extends Bicicletta {
    boolean hasBikeBell;
    boolean hasLight;
    statoLuce light;

    public Tandem(boolean hasBikeBell, boolean hasLight) {
        super(3);
        this.hasBikeBell = hasBikeBell;
        this.hasLight = hasLight;
        light = statoLuce.SPENTA;
    }

    public boolean HasBikeBell() {
        return hasBikeBell;
    }

    public boolean HasLight() {
        return hasLight;
    }

    public boolean ringBell() {
        if (!hasBikeBell) {
            return false;
        }
        return true;
    }
    public statoLuce getLight() {
        return light;
    }

    public boolean lightOnOff() {
        if (hasLight) {
            if (light == statoLuce.ACCESA) {
                light = statoLuce.SPENTA;
                return true;
            } else if (light == statoLuce.SPENTA) {
                light = statoLuce.ACCESA;
                return true;
            }
        }
        return false;
    }
    enum statoLuce {
        ACCESA, SPENTA;
    }
    public void stampaSpecifiche() {
        super.stampaSpecifiche();
        System.out.println("Ha il campanello? " + hasLight);
        System.out.println("Ha la luce? " + hasBikeBell);
    }
}
