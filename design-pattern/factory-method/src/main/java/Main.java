public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        Vehicle fusca = carFactory.getVehicle("Fusca");
        fusca.pickUp("Teste");

    }
}
