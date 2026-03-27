package labwork3.problem6;

import labwork2.problem5.persons.Student;
import labwork2.problem5.persons.Employee;
import labwork2.problem5.persons.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 3);
        Cat whiskers = new Cat("Whiskers", 5);

        rex.train("sit");
        rex.train("shake");
        System.out.println(rex.describe());
        System.out.println("knows sit: " + rex.knows("sit"));

        Dog rexClone = (Dog) rex.clone();
        rexClone.train("roll");
        System.out.println("clone knows roll: " + rexClone.knows("roll"));
        System.out.println("original knows roll: " + rex.knows("roll"));

        Person alice = new Student("Alice", 20, "CS");
        Person bob = new Employee("Bob", 35, "Engineer");
        alice.assignPet(rex);
        bob.assignPet(whiskers);

        Person[] people = {bob, alice};
        Arrays.sort(people);
        for (Person p : people) System.out.println(p + " - " + p.getOccupation());
    }
}
