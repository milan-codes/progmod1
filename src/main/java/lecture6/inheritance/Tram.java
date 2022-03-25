package lecture6.inheritance;

public class Tram extends PublicVehicle {
    private int numberOfTramCars;

    public Tram() {
    }

    public int getNumberOfTramcars() {
        return numberOfTramCars;
    }

    public void setNumberOfTramcars(int numberOfTramCars) {
        this.numberOfTramCars = numberOfTramCars;
    }
}
