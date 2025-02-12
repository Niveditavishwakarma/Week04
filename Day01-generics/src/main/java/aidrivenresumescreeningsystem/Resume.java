package aidrivenresumescreeningsystem;

public class Resume<T extends JobRole>{
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public String processResume() {
        return "Processing Resume for: " + jobRole.getJobDescription();
    }
}
