package SE.Creational.Singleton;

public class Main {

    public static void main(String[] args) {
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        Student s3 = Student.getStudent();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
