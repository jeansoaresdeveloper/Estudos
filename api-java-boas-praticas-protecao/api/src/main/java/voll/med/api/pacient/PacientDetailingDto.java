package voll.med.api.pacient;

import voll.med.api.address.Address;

public record PacientDetailingDto(
        Long id,
        String name,
        String phone,
        String email,
        String cpf,
        Address address,
        boolean active
) {
    public PacientDetailingDto(Pacient pacient) {
        this(pacient.getId(), pacient.getName(), pacient.getPhone(), pacient.getEmail(), pacient.getCpf(), pacient.getAddress(), pacient.getActive());
    }
}
