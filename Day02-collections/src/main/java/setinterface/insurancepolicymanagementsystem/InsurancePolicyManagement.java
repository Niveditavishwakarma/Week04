package setinterface.insurancepolicymanagementsystem;
import java.util.*;
public class InsurancePolicyManagement {

        private Set<InsurancePolicy> hashSet = new HashSet<>();
        private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        private Set<InsurancePolicy> treeSet = new TreeSet<>();

        public void addPolicy(InsurancePolicy policy) {
            hashSet.add(policy);
            linkedHashSet.add(policy);
            treeSet.add(policy);
        }

        public Set<InsurancePolicy> getAllPolicies() {
            return new HashSet<>(hashSet);
        }

        public Set<InsurancePolicy> getExpiringSoon(Date currentDate) {
            Set<InsurancePolicy> expiringSoon = new TreeSet<>();
            for (InsurancePolicy policy : treeSet) {
                long diff = policy.getExpiryDate().getTime() - currentDate.getTime();
                if (diff <= (30L * 24 * 60 * 60 * 1000)) {
                    expiringSoon.add(policy);
                }
            }
            return expiringSoon;
        }

        public Set<InsurancePolicy> getByCoverageType(String coverageType) {
            Set<InsurancePolicy> result = new HashSet<>();
            for (InsurancePolicy policy : hashSet) {
                if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                    result.add(policy);
                }
            }
            return result;
        }

        public Set<InsurancePolicy> getDuplicatePolicies() {
            Map<String, Integer> policyCount = new HashMap<>();
            Set<InsurancePolicy> duplicates = new HashSet<>();

            for (InsurancePolicy policy : hashSet) {
                policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
            }

            for (InsurancePolicy policy : hashSet) {
                if (policyCount.get(policy.getPolicyNumber()) > 1) {
                    duplicates.add(policy);
                }
            }
            return duplicates;
        }
}
