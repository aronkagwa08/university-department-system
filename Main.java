public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Aron", "S101", "aron@email.com", "Computer Science");
        Lecturer l1 = new Lecturer("Dr. John", "L201",
                "john@email.com", 50000, "IT Department");

        s1.enrollCourse("OOP");
        s1.displayRole();

        l1.displayRole();
        System.out.println("Total Payment: " + l1.calculatePayment());

        Course c1 = new Course("CS101", "Object Oriented Programming", 3);
        System.out.println("Total Courses Created: " + Course.getTotalCourses());
    }
}