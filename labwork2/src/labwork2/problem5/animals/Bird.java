package labwork2.problem5.animals;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Chirp";
    }
}
