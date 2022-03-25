package lecture6.inheritance;

public class Bus extends PublicVehicle {
    private boolean isElectric;

    public Bus() {
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }
}
