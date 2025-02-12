package coursemanagementsystem;

public class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through a written exam.");
    }
}
