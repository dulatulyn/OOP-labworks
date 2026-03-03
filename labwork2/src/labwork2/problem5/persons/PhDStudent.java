package labwork2.problem5.persons;

import labwork2.problem5.animals.Animal;
import labwork2.problem5.animals.Dog;

public class PhDStudent extends Person {

    private String field;
    private String researchTopic;

    public PhDStudent(String name, int age, String field, String researchTopic) {
        super(name, age);
        this.field = field;
        this.researchTopic = researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("Dogs are not allowed in PhD students' homes!");
            return;
        }
        this.pet = pet;
    }

    @Override
    public void removePet() {
        this.pet = null;
    }

    @Override
    public boolean hasPet() {
        return pet != null;
    }

    @Override
    public String getOccupation() {
        return "PhDStudent (" + field + ", " + researchTopic + ")";
    }
}