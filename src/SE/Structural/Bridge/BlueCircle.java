package SE.Structural.Bridge;

public class BlueCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x,y: " + x + ", " + y + "]");
    }
}