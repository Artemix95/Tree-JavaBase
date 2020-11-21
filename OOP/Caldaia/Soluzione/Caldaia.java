package caldaia;

public class Caldaia {
    private boolean isOn;
    private double tempAcqua; //gradi centigradi

    public Caldaia() {
        isOn = false;
        tempAcqua = 25;
    }

    public Caldaia(boolean isOn) {
        this.isOn = isOn;
        tempAcqua = 25;
    }

    public boolean getStatoCaldaia() {
        return isOn;
    }

    public void stampaStatoCaldaia() {
        if (getStatoCaldaia()) {
            System.out.println("La caldaia è accesa, la temp è: " + String.format("%.1f° ", tempAcqua));
        } else {
            System.out.println("La caldaia è spenta, la temp è: " + String.format("%.1f° ", tempAcqua));
        }
    }

    public void accendi() {
        isOn = true;
        aumentaTemp();
    }

    public void spegni() {
        isOn = false;
        tempAcqua = 25;
    }

    //aumenta temperatura un grado alla volta fino max 55°
    public boolean aumentaTemp() {
        if (!isOn) { //la caldaia deve essere accesa
            return false;
        }

        if (tempAcqua >= 55) {
            return false;
        }
        tempAcqua++;
        return true;
    }

    //decrementa temperatura un grado alla volta fino min 15°
    public boolean decrementaTemp() {
        if (tempAcqua <= 25) {
            return false;
        }
        tempAcqua--;
        return true;
    }

    //permette di settare qualunque temp compresa tra 15° e 55°
    public boolean setTemp(double temp) {
        if (!isOn) {
            return false;
        }
        if (temp < 0) { //non si può inserire valore negativo
            return false;
        }
        if ((temp > 55) || (temp < 25)) {
            return false;
        }

        tempAcqua = temp;
        return true;
    }

    //permette di aumentare la temperatura di una certa quantità
    public boolean aumentaTemp(double temp) {
        if (!isOn) {
            return false;
        }
        if (temp < 0) {
            return false;
        }
        //la temperatura non supera comunque i 55°
        if (tempAcqua + temp >= 55) {
            setTemp(55);
            return true;
        }
        tempAcqua += temp;
        return true;
    }

    //permette di decrementare la temperatura di una certa quantità
    public boolean decrementaTemp(double temp) {
        if (temp < 0) {
            return false;
        }
        //la temp non scende sotto i 25°
        if (tempAcqua - temp < 25) {
            setTemp(25);
            return true;
        }
        tempAcqua -= temp;
        return true;
    }

    public double getTempAcqua() {
        return tempAcqua;
    }
}
