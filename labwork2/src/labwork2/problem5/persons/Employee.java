package labwork2.problem5.persons;

import labwork2.problem5.animals.Animal;

public class Employee extends Person {

    private String position;

    public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
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
        return "Employee (" + position + ")";
    }
}