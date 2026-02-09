package labwork1.problem2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nurasyl", Major.CS,2, 3.73);

        System.out.println(student.university); // у всех объектов одно статичное поле

        System.out.println(student.toString());
    }
}
