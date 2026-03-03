package labwork2.problem5.persons;

import labwork2.problem5.animals.Animal;

public class Student extends Person {

    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void assignPet(Animal pet) {
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
        return "Student (" + major + ")";
    }
}