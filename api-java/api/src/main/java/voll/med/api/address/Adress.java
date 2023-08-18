package voll.med.api.address;

public record Adress(
        String street,
        String district,
        String cep,
        String city,
        String uf,
        String complement,
        String number
) {}
