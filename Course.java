package railworld;

public class Course {

	private String courseName;
    private Lecturer lecturer;

    public Course(String courseName, Lecturer lecturer) {
        this.courseName = courseName;
        this.lecturer = lecturer;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public static void main(String[] args) {
        // Create a Lecturer
        Lecturer mathLecturer = new Lecturer("Dr. Smith");

        // Create a Course and associate the Lecturer
        Course mathCourse = new Course("Math 101", mathLecturer);

        // Access course details
        System.out.println("Course: " + mathCourse.getCourseName());
        System.out.println("Lecturer: " + mathCourse.getLecturer().getName());
    }

}
