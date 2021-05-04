package SE.Behavioral.State;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV(new OFF());
        tv.togglePower();
        tv.togglePower();
    }
}
