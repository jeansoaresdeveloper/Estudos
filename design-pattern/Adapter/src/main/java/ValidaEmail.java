public class ValidaEmail {

    public static boolean valida(EmailValidatorProtocol emailValidator, String email) {
        return emailValidator.isEmail(email);
    }

}
