package setinterface.insurancepolicymanagementsystem;
import java.util.*;
    public class Main {
        public static void main(String[] args) {
            InsurancePolicyManagement system = new InsurancePolicyManagement();
            system.addPolicy(new InsurancePolicy("P1001", "John Doe", new Date(2025, 6, 15), "Health", 500.0));
            system.addPolicy(new InsurancePolicy("P1002", "Jane Smith", new Date(2024, 3, 10), "Auto", 750.0));
            system.addPolicy(new InsurancePolicy("P1003", "John Doe", new Date(2024, 3, 20), "Home", 1000.0));

            System.out.println("All Policies: " + system.getAllPolicies());
            System.out.println("Expiring Soon: " + system.getExpiringSoon(new Date(2024, 2, 20)));
            System.out.println("Auto Policies: " + system.getByCoverageType("Auto"));
        }
    }

