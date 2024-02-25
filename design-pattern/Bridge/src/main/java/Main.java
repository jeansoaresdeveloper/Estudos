import device.Tv;
import remote_control.RemoteControlWithVolume;

public class Main {

    public static void main(String[] args) {

        Tv tv = new Tv();
        RemoteControlWithVolume remoteControlWithVolume = new RemoteControlWithVolume(tv);

        remoteControlWithVolume.togglePower();
        remoteControlWithVolume.volumeUp();
        System.out.println(tv);

    }

}
