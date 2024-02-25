package domain;

public class Address {

    private final String street;

    private final String number;

    public Address(String street, String number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }
}
