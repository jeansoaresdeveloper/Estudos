public class Main {

    public static void main(String[] args) {

        boolean valida = ValidaEmail.valida(new EmailValidatorAdapter(), "jean@gmail.com");

        System.out.println(valida);

    }

}
