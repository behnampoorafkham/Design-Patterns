package SE.Creational.Builder;

public class Builder {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String fathersName;
    private String mothersName;
    private double height;
    private double weight;

    public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


    public Builder setAge(int age) {
        this.age = age;
        return this;
    }


    public Builder setFathersName(String fathersName) {
        this.fathersName = fathersName;
        return this;
    }


    public Builder setMothersName(String mothersName) {
        this.mothersName = mothersName;
        return this;
    }


    public Builder setHeight(double height) {
        this.height = height;
        return this;
    }

    public Builder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public Person build() {
        return new Person(firstName, middleName, lastName, age, fathersName, mothersName, height, weight);
    }
}