package SE.Creational.Prototype;

public class Student implements Cloneable {

    private int id;
    private String name;
    private String StudentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public Student(int id, String name, String studentId) {
        this.id = id;
        this.name = name;
        StudentId = studentId;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return new Student(id,name,StudentId);
    }
}
