package voll.med.api.pacient;

import jakarta.validation.constraints.NotNull;
import voll.med.api.address.AddressDto;

public record DataUpdatePacientDto(
        @NotNull
        Long id,
        String name,
        String phone,
        AddressDto addressDto
) {
}
