package labwork1.problem4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Course course = new Course("OOP", "CSCI2105", 3, 2);
        GradeBook gradeBook = new GradeBook(course);

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, input number of students: ");
        int n = sc.nextInt();

        System.out.println("Please, input grades for students:");

        for (int i = 0; i < n; i++) {

            char letter = (char)('A' + i);

            System.out.print("Student " + letter + ": ");
            int grade = sc.nextInt();

            Student s = new Student("Student " + letter, String.valueOf(i+1));
            s.setGrade(grade);

            gradeBook.addStudent(s);
        }

        System.out.println();

        gradeBook.displayMessage();
        gradeBook.displayGradeReport();
    }
}