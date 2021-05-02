package SE.Structural.Flyweight;

public class Main {

    public static void main(String[] args) {
        CacheStudent cacheStudent = new CacheStudent();
        System.out.println(cacheStudent.getStudent(1).hashCode());
        System.out.println(cacheStudent.getStudent(1).hashCode());
    }
}
