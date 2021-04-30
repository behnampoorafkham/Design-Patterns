package SE.Structural.Adapter;

public class Main {

    static AdapterExam adapterExam;

    public static void main(String[] args) {

        adapterExam = new AdapterExam(400);
        adapterExam = new AdapterExam(200);
    }
}
