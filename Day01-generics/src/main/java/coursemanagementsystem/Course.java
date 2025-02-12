package coursemanagementsystem;

class Course<T extends CourseType> {
    private T course;

    public Course(T course) {
        this.course = course;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + course.getCourseName());
        course.evaluate();
    }
}
