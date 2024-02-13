import factories.EnterpriseCustomerVehicleFactory;
import factories.IndividualCustomerVehicleFactory;
import interfaces.Customer;
import interfaces.Vehicle;

public class Main {

    public static void main(String[] args) {

        EnterpriseCustomerVehicleFactory enterpriseCustomerVehicleFactory = new EnterpriseCustomerVehicleFactory();
        Customer jean = enterpriseCustomerVehicleFactory.createCustomer("Jean");
        Vehicle fusca = enterpriseCustomerVehicleFactory.createVehicle("Fusca", jean);

        IndividualCustomerVehicleFactory individualCustomerVehicleFactory = new IndividualCustomerVehicleFactory();
        Customer richardo = individualCustomerVehicleFactory.createCustomer("Richardo");
        Vehicle camaro = individualCustomerVehicleFactory.createVehicle("Camaro", richardo);

        fusca.pickUp();
        camaro.pickUp();
    }

}
