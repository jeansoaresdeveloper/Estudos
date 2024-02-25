package delivery;

public class DeliveryLocation implements DeliveryFlyWeight {

    private final DeliveryLocationData intrinsicState;

    public DeliveryLocation(DeliveryLocationData intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void deliver(String nameClient, String numberHome) {
        System.out.println("Entrega para " + nameClient);
        System.out.println("Em " + intrinsicState.getCity() + " " + intrinsicState.getStreet());
        System.out.println("Número: " + numberHome);
    }

    public DeliveryLocationData getIntrinsicState() {
        return intrinsicState;
    }

    @Override
    public String toString() {
        return "DeliveryLocation{" +
                "intrinsicState=" + intrinsicState +
                '}';
    }
}
