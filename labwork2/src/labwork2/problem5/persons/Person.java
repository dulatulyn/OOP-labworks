package labwork2.problem5.persons;

import labwork2.problem5.animals.Animal;

public abstract class Person {
    String name;
    int age;
    Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void assignPet(Animal pet);
    public abstract void removePet();
    public abstract boolean hasPet();
    public abstract String getOccupation();

    public void leavePetWith(Person other) {
        if (!this.hasPet()) return;
        if (other.hasPet()) return;

        Animal temp = this.pet;
        this.removePet();
        other.assignPet(temp);
    }

    public void retrievePetFrom(Person other) {
        if (!other.hasPet()) return;
        if (this.hasPet()) return;

        Animal temp = other.pet;
        other.removePet();
        this.assignPet(temp);
    }

    public String toString() {
        return name + " (" + age + ")";
    }

    public boolean equals(Object obj) {
        return this.name.equals(((Person) obj).name);
    }

    public int hashCode() {
        return name.hashCode();
    }
}
