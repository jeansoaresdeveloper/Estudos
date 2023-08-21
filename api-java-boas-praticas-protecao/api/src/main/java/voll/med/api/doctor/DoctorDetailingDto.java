package voll.med.api.doctor;

import voll.med.api.address.Address;

public record DoctorDetailingDto(
        Long id,
        String name,
        String email,
        String crm,
        String phone,
        Specialty specialty,
        Address address
) {
    public DoctorDetailingDto(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getPhone(), doctor.getSpecialty(), doctor.getAddress());
    }
}
