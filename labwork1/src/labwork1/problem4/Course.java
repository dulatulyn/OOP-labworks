package labwork1.problem4;

public class Course {
    private String name;
    private String description;
    private int credits;
    private int prerequisites;

    public Course(String name, String description, int credits, int prerequisites){
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }
}