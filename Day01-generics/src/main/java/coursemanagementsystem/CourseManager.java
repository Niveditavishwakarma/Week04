package coursemanagementsystem;
import java.util.List;
class CourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.getCourseName());
            course.evaluate();
        }
    }
}
