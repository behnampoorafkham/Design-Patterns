package SE.Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class CacheStudent {
    List<Student> students = new ArrayList<>();

    public Student getStudent(int id) {
        for (Student item:students) {
            if (item.id == id){
                return item;
            }
        }
        System.out.println("OK");
        Student s1 = new Student(id);
        s1.name = "behnam";
        students.add(s1);
        return s1;
    }
}
