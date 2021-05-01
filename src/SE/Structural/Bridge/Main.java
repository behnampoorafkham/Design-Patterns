package SE.Structural.Bridge;

public class Main {
    public static void main(String[] args) {

        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        redCircle.draw();

        Shape blueCircle = new Circle(100,100, 10, new BlueCircle());
        blueCircle.draw();
    }
}
