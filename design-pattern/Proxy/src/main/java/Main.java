import domain.SystemUserProxy;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        SystemUserProxy systemUserProxy = new SystemUserProxy("Jean", "Anaximandro");
        System.out.println(systemUserProxy.getAdresses());

        System.out.println(systemUserProxy.getAdresses());

    }
}
