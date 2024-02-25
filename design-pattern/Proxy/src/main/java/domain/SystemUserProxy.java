package domain;

import interfaces.SystemUser;

import java.util.ArrayList;
import java.util.List;

public class SystemUserProxy implements SystemUser {

    private SystemUser realUser;

    private List<Address> realUserAddresses;

    private final String name;

    private final String userName;

    private final List<Address> addresses = new ArrayList<Address>();

    public SystemUserProxy(String name, String userName) {
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
        realUser = createUser();

        if (realUserAddresses == null) {
            realUserAddresses = realUser.getAdresses();
        }

        return realUserAddresses;
    }

    public SystemUser createUser() {
        if (realUser == null) {
            this.realUser = new AdminUser(name, userName);
        }

        return realUser;

    }


}
