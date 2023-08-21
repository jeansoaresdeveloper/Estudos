package voll.med.api.doctor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.address.Address;

@Table(name = "doctor")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Specialty specialty;
    @Embedded
    private Address address;

    private boolean active;

    public Doctor(DoctorDto doctor) {
        this.name = doctor.name();
        this.email = doctor.email();
        this.crm = doctor.crm();
        this.phone = doctor.phone();
        this.specialty = doctor.specialty();
        this.address = new Address(doctor.address());
        this.active = true;
    }

    public void updateInfo(DataUpdateDoctorDto newDoctor) {
        if (newDoctor.name() != null) {
            this.name = newDoctor.name();
        }
        if (newDoctor.phone() != null) {
            this.name = newDoctor.phone();
        }
        if (newDoctor.addressDto() != null) {
            this.address.updateInfo(newDoctor.addressDto());
        }
    }

    public void inactiveDoctor() {
        this.active = false;
    }
}
