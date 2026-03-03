package labwork2.problem5;

import labwork2.problem5.animals.Animal;
import labwork2.problem5.animals.Cat;
import labwork2.problem5.persons.Employee;
import labwork2.problem5.persons.Person;
import labwork2.problem5.persons.PersonRegistry;
import labwork2.problem5.persons.PhDStudent;

public class Main {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);
        john.assignPet(murka); // John owns Rex
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
// John goes on vacation and leaves Rex with Alice
        john.leavePetWith(alice);
// Registry reflects that Alice is taking care of Rex
        System.out.println(registry);
// John returns from vacation and retrieves Rex
        john.retrievePetFrom(alice);
// Registry reflects that John has his dog back
        System.out.println(registry);
    }
}
