import java.util.ArrayList;

public class Student extends Person implements Enrollable {

    private String program;
    private ArrayList<String> courses;

    public Student(String name, String id, String email, String program) {
        super(name, id, email);
        this.program = program;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(String courseName) {
        courses.add(courseName);
    }

    public void dropCourse(String courseName) {
        courses.remove(courseName);
    }

    @Override
    public void displayRole() {
        System.out.println("I am a Student in " + program);
    }
}