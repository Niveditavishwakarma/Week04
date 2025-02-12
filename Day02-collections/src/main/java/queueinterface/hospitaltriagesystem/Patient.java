package queueinterface.hospitaltriagesystem;

 class Patient implements Comparable<Patient> {
     String name;
     int severity;

     public Patient(String name, int severity) {
         this.name = name;
         this.severity = severity;
     }

     @Override
     public int compareTo(Patient other) {
         return Integer.compare(other.severity, this.severity);
     }

     @Override
     public String toString() {
         return name + " (Severity: " + severity + ")";
     }
}
