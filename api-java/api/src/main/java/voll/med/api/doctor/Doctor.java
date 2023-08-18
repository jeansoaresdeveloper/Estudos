package voll.med.api.doctor;

import voll.med.api.address.Adress;

public record Doctor(
        String name,
        String email,
        String crm,
        Specialty specialty,
        Adress address
) {}
