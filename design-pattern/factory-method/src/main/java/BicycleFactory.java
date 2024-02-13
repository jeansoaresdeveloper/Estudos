public class BicycleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleName) {
        return new Bicycle(vehicleName);
    }
}
