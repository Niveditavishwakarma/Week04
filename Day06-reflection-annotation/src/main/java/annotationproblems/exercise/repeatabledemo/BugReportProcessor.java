package annotationproblems.exercise.repeatabledemo;
import java.lang.reflect.Method;
public class BugReportProcessor {

        public static void main(String[] args) {
            try {
                Class<?> clazz = BugTracker.class;

                Method method = clazz.getMethod("trackBugs");

                if (method.isAnnotationPresent(BugReports.class)) {
                    BugReports bugReports = method.getAnnotation(BugReports.class);

                    for (BugReport bugReport : bugReports.value()) {
                        System.out.println("Bug Report: " + bugReport.description());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


