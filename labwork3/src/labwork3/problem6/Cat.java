package labwork3.problem6;

import java.util.ArrayList;
import java.util.List;

public class Cat extends labwork2.problem5.animals.Cat implements Trainable, Describable {
    private List<String> learnedCommands = new ArrayList<>();

    public Cat(String name, int age) {
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
    public String describe() {
        return getName() + " the Cat, " + getAge() + " y/o";
    }
}
