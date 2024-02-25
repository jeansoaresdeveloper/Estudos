package delivery;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class DeliveryFactory {

    private final Map<String, DeliveryLocation> locations = new HashMap<>();

    private String createId(DeliveryLocationData data) {
        return String.join("", List.of(data.getStreet(), data.getCity())).toLowerCase(Locale.getDefault());
    }

    public DeliveryFlyWeight makeLocation(DeliveryLocationData intrinsicState) {
        String id = createId(intrinsicState);

        if (locations.containsKey(id)) {
            return locations.get(id);
        }

        DeliveryLocation deliveryLocation = new DeliveryLocation(intrinsicState);
        locations.put(id, deliveryLocation);
        return deliveryLocation;
    }

    public Map<String, DeliveryLocation> getLocations() {
        return locations;
    }
}
