package factories;

import customer.IndividualCustomer;
import interfaces.Customer;
import interfaces.Vehicle;
import vehicle.IndividualVehicle;

public class IndividualCustomerVehicleFactory implements CustomerVehicleFactory {

    public Customer createCustomer(String name) {
        return new IndividualCustomer(name);
    }

    public Vehicle createVehicle(String vehicleName, Customer customer) {
        return new IndividualVehicle(vehicleName, customer);
    }

}
