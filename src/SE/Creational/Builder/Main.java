package SE.Creational.Builder;

public class Main {

    public static void main(String[] args) {
        Person person = new Builder()
                .setFirstName("behnam")
                .setLastName("poorafkham")
                .setMiddleName("BE")
                .setAge(21)
                .setFathersName("Father")
                .setMothersName("Mother")
                .setWeight(21)
                .build();
        System.out.println(person.toString());
    }
}

