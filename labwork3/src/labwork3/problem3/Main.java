package labwork3.problem3;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("size - " + names.size());
        System.out.println(names.contains("Bob"));

        names.remove("Bob");
        for (String name : names)
            System.out.println(name);

        names.clear();
        System.out.println(names.isEmpty());
    }
}
