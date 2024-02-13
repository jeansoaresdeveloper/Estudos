package customer;

import interfaces.Customer;

public class EnterpriseCustomer implements Customer {

    private final String name;

    public EnterpriseCustomer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
