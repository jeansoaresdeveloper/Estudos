import delivery.DeliveryFactory;
import delivery.DeliveryFlyWeight;
import delivery.DeliveryLocationData;

public class Main {

    public static void main(String[] args) {

        DeliveryFactory factory = new DeliveryFactory();
        deliveryContext(factory, "Jean", "12", "Tal", "Sarandi");
        deliveryContext(factory, "João", "14", "Tal", "Sarandi");

        deliveryContext(factory, "Cassia", "26", "Tailandia", "Sarandi");

        System.out.println(factory.getLocations());


    }

    private static void deliveryContext(DeliveryFactory factory, String name,
                                 String number, String street, String city) {

        DeliveryFlyWeight deliveryFlyWeight = factory.makeLocation(new DeliveryLocationData(street, city));
        deliveryFlyWeight.deliver(name, number);

    }

}
