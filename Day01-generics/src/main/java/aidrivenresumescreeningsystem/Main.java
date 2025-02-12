package aidrivenresumescreeningsystem;

public class Main {
    public static void main(String[] args)
    {
        try {
            Resume<SoftwareEngineer> seResume = ResumeScreening.processCandidate(new SoftwareEngineer());
            Resume<DataScientist> dsResume = ResumeScreening.processCandidate(new DataScientist());
            Resume<ProductManager> pmResume = ResumeScreening.processCandidate(new ProductManager());

            System.out.println(seResume.processResume());
            System.out.println(dsResume.processResume());
            System.out.println(pmResume.processResume());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

