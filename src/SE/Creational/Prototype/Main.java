package SE.Creational.Prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student(1,"behnam","12");
        Student s2 = s1.clone();
        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }
}
