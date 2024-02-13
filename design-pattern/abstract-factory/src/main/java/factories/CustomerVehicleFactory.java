package factories;

import interfaces.Customer;
import interfaces.Vehicle;

public interface CustomerVehicleFactory {

    Customer createCustomer(String name);

    Vehicle createVehicle(String vehicleName, Customer customer);

}