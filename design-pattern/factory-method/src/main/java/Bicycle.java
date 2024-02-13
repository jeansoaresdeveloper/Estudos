public class Bicycle implements Vehicle{

    private final String name;

    public Bicycle(String name) {
        this.name = name;
    }

    public void pickUp(String customerName) {
        System.out.printf("O %s está buscando o %s%n", name, customerName);
    }

    public void stop() {
        System.out.printf("%s parado", name);
    }
}
