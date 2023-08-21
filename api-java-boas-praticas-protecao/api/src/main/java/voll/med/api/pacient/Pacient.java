package voll.med.api.pacient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.address.Address;

@Table(name = "pacient")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pacient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    private String phone;

    private String cpf;

    @Embedded
    private Address address;

    private Boolean active;

    public Pacient(PacientDto pacient) {
        this.active = true;
        this.name = pacient.name();
        this.email = pacient.email();
        this.phone = pacient.phone();
        this.cpf = pacient.cpf();
        this.address = new Address(pacient.address());
    }

    public void updateInfo(DataUpdatePacientDto newPacient) {
        if (newPacient.name() != null) {
            this.name = newPacient.name();
        }
        if (newPacient.phone() != null) {
            this.phone = newPacient.phone();
        }
        if (newPacient.addressDto() != null) {
            this.address.updateInfo(newPacient.addressDto());
        }

    }

    public void inactivePacient() {
        this.active = false;
    }
}
