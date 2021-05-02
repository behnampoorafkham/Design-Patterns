package SE.Structural.Flyweight;

public class Student {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public Student(int id) {
        this.id = id;
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

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
