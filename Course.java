public class Course {

    private String courseCode;
    private String courseTitle;
    private int creditHours;
    private static int totalCourses = 0;

    public Course(String courseCode, String courseTitle, int creditHours) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        totalCourses++;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseTitle() { return courseTitle; }
    public int getCreditHours() { return creditHours; }

    public static int getTotalCourses() {
        return totalCourses;
    }
}
