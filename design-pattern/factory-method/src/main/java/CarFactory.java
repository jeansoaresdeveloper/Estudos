public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleName) {
        return new Car(vehicleName);
    }
}
