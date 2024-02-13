package customer;

import interfaces.Customer;

public class IndividualCustomer implements Customer {

    private final String name;

    public IndividualCustomer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
