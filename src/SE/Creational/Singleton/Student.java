package SE.Creational.Singleton;

public class Student {

    static private Student student = null;

    Student(){
    }

    public static Student getStudent() {
        if (student==null){
            student = new Student();
        }
        return student;
    }
}
