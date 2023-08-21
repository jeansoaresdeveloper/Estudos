package voll.med.api.doctor;

import jakarta.validation.constraints.NotNull;
import voll.med.api.address.AddressDto;

public record DataUpdateDoctorDto(
        @NotNull
        Long id,
        String name,
        String phone,
        AddressDto addressDto
) {}
