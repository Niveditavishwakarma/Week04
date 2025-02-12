package queueinterface.hospitaltriagesystem;
import java.util.*;
class HospitalTriageSystem {
    public static List<String> triagePatients(List<Patient> patients) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(patients); // Using PriorityQueue

        List<String> treatedOrder = new ArrayList<>();
        while (!pq.isEmpty()) {
            treatedOrder.add(pq.poll().name);
        }
        return treatedOrder;
    }
}
