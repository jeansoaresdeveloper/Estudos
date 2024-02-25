package device;

public class Radio implements Device {

    private final String name = "Radio";

    private Boolean power = Boolean.FALSE;

    private Integer volume = 10;

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

}