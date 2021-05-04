package SE.Behavioral.State;

public class TV {
    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    private RemoteControl remoteControl;

    public TV(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public void togglePower(){
        remoteControl.switchState(this);
    }
}
