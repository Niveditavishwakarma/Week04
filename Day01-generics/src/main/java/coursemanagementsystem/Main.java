package coursemanagementsystem;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Mathematics"));
        courses.add(new AssignmentCourse("Programming"));
        courses.add(new ResearchCourse("AI Research"));

        CourseManager.displayCourses(courses);
    }
}
