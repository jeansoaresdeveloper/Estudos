package voll.med.api.doctor;

public record DataListingDoctorDto(
        Long id,
        String name,
        String email,
        String crm,
        Specialty specialty
) {
    public DataListingDoctorDto(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }
}
