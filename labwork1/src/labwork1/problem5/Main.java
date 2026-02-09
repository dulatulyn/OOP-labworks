package labwork1.problem5;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Vector<Person> persons = new Vector<>();

        for(char ch : s.toCharArray()) {
            if(ch == 'B') {
                persons.add(new Person(Gender.BOY));
            } else {
                persons.add(new Person(Gender.GIRL));
            }
        }

        DragonLaunch dragonLaunch = new DragonLaunch(persons);
        dragonLaunch.willDragonEatOrNot();

        dragonLaunch.persons.forEach(System.out::println);
    }
}
