package device;

public class Tv implements Device {

    private final String name = "TV";

    private Boolean power = Boolean.FALSE;

    private Integer volume = 20;

    public String getName() {
        return name;
    }

    public void setPower(Boolean powerStatus) {
        power = powerStatus;
    }

    public Boolean getPower() {
        return power;
    }

    public void setVolume(Integer volume) {

        if (volume < 0 || volume > 100)
            return;

        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                '}';
    }
}
