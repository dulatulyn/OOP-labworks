package labwork1.problem5;

public class Person {
    public Gender gender;
    public String name;

    public Person(Gender gender) {
        this.gender = gender;
        this.name = "";
    }

    public Person(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", gender=" + gender + "]";
    }

}
