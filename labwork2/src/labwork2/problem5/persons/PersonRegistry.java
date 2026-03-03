package labwork2.problem5.persons;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {

    private List<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public List<Person> getPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> getPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (!p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";

        for (Person p : people) {
            result += p.toString();

            if (p.hasPet()) result += " | Pet: " + p.pet.getClass().getSimpleName();
            else result += " | No pet";

            result += "\n";
        }

        return result;
    }
}