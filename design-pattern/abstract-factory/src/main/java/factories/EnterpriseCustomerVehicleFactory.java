package factories;

import customer.EnterpriseCustomer;
import interfaces.Customer;
import interfaces.Vehicle;
import vehicle.EnterpriseVehicle;

public class EnterpriseCustomerVehicleFactory implements CustomerVehicleFactory {

    public Customer createCustomer(String name) {
        return new EnterpriseCustomer(name);
    }

    public Vehicle createVehicle(String vehicleName, Customer customer) {
        return new EnterpriseVehicle(vehicleName, customer);
    }

}
