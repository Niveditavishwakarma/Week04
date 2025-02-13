package setinterface.insurancepolicymanagementsystem;

    import java.util.*;
    public class InsurancePolicy implements Comparable<InsurancePolicy>{
        private String policyNumber;
        private String policyholderName;
        private Date expiryDate;
        private String coverageType;
        private double premiumAmount;

        public InsurancePolicy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.policyholderName = policyholderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premiumAmount = premiumAmount;
        }

        public String getPolicyNumber() { return policyNumber; }
        public String getCoverageType() { return coverageType; }
        public Date getExpiryDate() { return expiryDate; }

        @Override
        public int compareTo(InsurancePolicy other) {
            return this.expiryDate.compareTo(other.expiryDate);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            InsurancePolicy policy = (InsurancePolicy) obj;
            return policyNumber.equals(policy.policyNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(policyNumber);
        }

        @Override
        public String toString() {
            return "Policy{" + "Number='" + policyNumber + '\'' + ", Holder='" + policyholderName + '\'' + ", Expiry=" + expiryDate + ", Coverage='" + coverageType + '\'' + ", Premium=" + premiumAmount + '}';
        }
}
