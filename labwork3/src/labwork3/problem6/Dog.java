package labwork3.problem6;

import java.util.ArrayList;
import java.util.List;

public class Dog extends labwork2.problem5.animals.Dog implements Trainable, Describable {
    private List<String> learnedCommands = new ArrayList<>();

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void train(String command) {
        if (!learnedCommands.contains(command))
            learnedCommands.add(command);
    }

    @Override
    public boolean knows(String command) {
        return learnedCommands.contains(command);
    }

    @Override
    public Dog clone() {
        Dog cloned = (Dog) super.clone();
        cloned.learnedCommands = new ArrayList<>(this.learnedCommands);
        return cloned;
    }

    @Override
    public String describe() {
        return getName() + " the Dog, " + getAge() + " y/o";
    }
}
