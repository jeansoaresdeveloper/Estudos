package device;

public interface Device {

    String getName();

    void setPower(Boolean powerStatus);

    Boolean getPower();

    void setVolume(Integer volume);

    Integer getVolume();

}
