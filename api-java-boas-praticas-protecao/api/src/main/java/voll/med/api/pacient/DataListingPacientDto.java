package voll.med.api.pacient;

public record DataListingPacientDto(Long id, String name, String email, String cpf) {
    public DataListingPacientDto(Pacient pacient) {
        this(pacient.getId(), pacient.getName(), pacient.getEmail(), pacient.getCpf());
    }
}
