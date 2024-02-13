public class Car implements Vehicle{

    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public void pickUp(String customerName) {
        System.out.printf("O %s está buscando o %s%n", name, customerName);
    }

    public void stop() {
        System.out.println("Carro parado");
    }
}
