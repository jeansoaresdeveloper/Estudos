// Caso a libEmail para validação se altere é só alterar no adapter.

public class EmailValidatorAdapter implements EmailValidatorProtocol {

    public boolean isEmail(String email) {
        return LibEmail.pattern.matcher(email).matches();
    }
}
