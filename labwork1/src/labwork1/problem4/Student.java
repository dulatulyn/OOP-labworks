package labwork1.problem4;

public class Student {
    private String id;
    private String name;
    private int grade;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}