package labwork2.problem5.persons;

import labwork2.problem5.animals.Animal;

import java.io.Serializable;

public abstract class Person implements Serializable, Comparable<Person> {
    String name;
    int age;
    Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

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

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
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
