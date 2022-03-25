package lecture6.inheritance;

import java.util.ArrayList;

public class PublicTransport {
    private ArrayList<PublicVehicle> vehicles = new ArrayList<>();

    public ArrayList<PublicVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<PublicVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(PublicVehicle vehicle) {
        vehicles.add(vehicle);
    }
}
