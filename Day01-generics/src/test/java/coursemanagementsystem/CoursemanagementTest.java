package coursemanagementsystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;

    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through a written exam.");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through assignments.");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated based on research work.");
    }
}

class Course<T extends CourseType> {
    private T course;

    public Course(T course) {
        this.course = course;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + course.getCourseName());
        course.evaluate();
    }

    public T getCourse() {
        return course;
    }
}

class CourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.getCourseName());
            course.evaluate();
        }
    }
}

class CourseSystem {
    public static void main(String[] args) {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Mathematics"));
        courses.add(new AssignmentCourse("Programming"));
        courses.add(new ResearchCourse("AI Research"));

        CourseManager.displayCourses(courses);
    }
}

public class CoursemanagementTest {
    @Test
    void testExamCourseEvaluation() {
        ExamCourse course = new ExamCourse("Mathematics");
        assertEquals("Mathematics", course.getCourseName());

    }

    @Test
    void testAssignmentCourseEvaluation() {
        AssignmentCourse course = new AssignmentCourse("Programming");
        assertEquals("Programming", course.getCourseName());
    }

    @Test
    void testResearchCourseEvaluation() {
        ResearchCourse course = new ResearchCourse("AI Research");
        assertEquals("AI Research", course.getCourseName());
    }

}
