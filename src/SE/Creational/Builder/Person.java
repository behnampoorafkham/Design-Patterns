package SE.Creational.Builder;

public class Person {

    private String firstName;
    private String middleName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    private String lastName;
    private int age;
    private String fathersName;
    private String mothersName;
    private double height;
    private double weight;

    public Person(String firstName, String middleName, String lastName, int age, String fathersName, String mothersName, double height, double weight) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.height = height;
        this.weight = weight;
    }
}