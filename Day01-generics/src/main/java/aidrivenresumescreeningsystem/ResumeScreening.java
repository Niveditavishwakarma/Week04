package aidrivenresumescreeningsystem;
import java.util.*;
public class ResumeScreening {
    public static <T extends JobRole> Resume<T> processCandidate(T jobRole) {
        if (jobRole == null) {
            throw new IllegalArgumentException("Invalid job role: Role cannot be null");
        }
        return new Resume<>(jobRole);
    }

    public static void processMultipleResumes(List<? extends JobRole> jobRoles) {
        for (JobRole jobRole : jobRoles) {
            System.out.println("Screening: " + jobRole.getJobDescription());
        }
    }
}
