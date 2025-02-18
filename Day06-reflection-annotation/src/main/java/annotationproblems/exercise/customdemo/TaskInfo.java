package annotationproblems.exercise.customdemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TaskInfo {
    String priority();
    String assignedTo();
}
