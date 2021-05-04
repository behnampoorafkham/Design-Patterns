package SE.Behavioral.State;

public class ON implements RemoteControl {
    @Override
    public void switchState(TV tv) {
        System.out.println("TV State is ON");
        tv.setRemoteControl(new OFF());
        System.out.println("TV State is OFF");
    }
}
