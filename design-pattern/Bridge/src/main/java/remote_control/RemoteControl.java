package remote_control;

import device.Device;

public class RemoteControl {

    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        this.device.setPower(!this.device.getPower());
    }

}
