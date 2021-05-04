package SE.Behavioral.State;

public class OFF implements RemoteControl {
    @Override
    public void switchState(TV tv) {
        System.out.println("TV State is OFF");
        tv.setRemoteControl(new ON());
        System.out.println("TV State is ON");
    }
}
