package lecture6.inheritance;

public class Metro extends PublicVehicle {
    private int numberOfStations;

    public Metro() {

    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }
}
