package voll.med.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String  street;
    private String  district;
    private String  cep;
    private String  city;
    private String  uf;
    private String  complement;
    private String  number;

    public Address(AddressDto address) {
        this.street = address.street();
        this.district = address.district();
        this.cep = address.cep();
        this.city = address.city();
        this.uf = address.uf();
        this.complement = address.complement();
        this.number = address.number();
    }

    public void updateInfo(AddressDto newAddress) {
        if (newAddress.street() != null) {
            this.street = newAddress.street();
        }
        if (newAddress.district() != null) {
            this.district = newAddress.district();
        }
        if (newAddress.cep() != null) {
            this.cep = newAddress.cep();
        }
        if (newAddress.city() != null) {
            this.city = newAddress.city();
        }
        if (newAddress.uf() != null) {
            this.uf = newAddress.uf();
        }
        if (newAddress.complement() != null) {
            this.complement = newAddress.complement();
        }
        if (newAddress.number() != null) {
            this.number = newAddress.number();
        }
    }
}
