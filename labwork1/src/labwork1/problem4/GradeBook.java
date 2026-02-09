package labwork1.problem4;

import java.util.ArrayList;

public class GradeBook {

    private Course course;
    private ArrayList<Student> students = new ArrayList<>();

    public GradeBook(Course course){
        this.course = course;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void displayMessage(){
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    public double determineClassAverage() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0);
    }

    public int getHighestGrade() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .max()
                .orElse(0);
    }

    public int getLowestGrade() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .min()
                .orElse(0);
    }

    private int[] outputBarChart() {
        int[] dist = new int[11];

        for (Student s : students)
            dist[s.getGrade() / 10]++;

        return dist;
    }

    public void displayGradeReport(){

        System.out.println("The Class Average is: " + determineClassAverage());
        System.out.println("Lowest grade is: " + getLowestGrade());
        System.out.println("Highest grade is: " + getHighestGrade());

        int[] dist = outputBarChart();

        for(int i = 0; i < dist.length; i++) {

            if(i == 10)
                System.out.print("100:   ");
            else
                System.out.printf("%02d-%02d: ", i*10, i*10+9);

            System.out.println("*".repeat(dist[i]));
        }
    }
}