package domain;

import interfaces.SystemUser;

import java.util.ArrayList;
import java.util.List;

public class AdminUser implements SystemUser {

    private final String name;

    private final String userName;

    private final List<Address> addresses = new ArrayList<Address>();

    public AdminUser(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public List<Address> getAdresses() throws InterruptedException {
        Thread.sleep(10000);
        return addresses;
    }
}
