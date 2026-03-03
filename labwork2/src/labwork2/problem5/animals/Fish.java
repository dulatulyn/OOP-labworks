package labwork2.problem5.animals;

public class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "gurgle gurgle";
    }
}
