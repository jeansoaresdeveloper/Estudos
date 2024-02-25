package remote_control;

import device.Device;

public class RemoteControlWithVolume extends RemoteControl {
    
    private static final Integer VOLUME = 5;

    public RemoteControlWithVolume(Device device) {
        super(device);
    }
    
    public void volumeUp() {
        this.device.setVolume(this.device.getVolume() + VOLUME);
    }

    public void volumeDown() {
        this.device.setVolume(this.device.getVolume() - VOLUME);
    }
    
}
