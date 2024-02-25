package interfaces;


import domain.Address;

import java.util.List;

public interface SystemUser {

    String getName();

    String getUserName();

    List<Address> getAdresses() throws InterruptedException;

}
