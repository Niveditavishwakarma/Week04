package mapinterface.groupobjects;
import java.util.*;

    class Employee {
        String name, department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public class GroupEmployees {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee("Alice", "HR"),
                    new Employee("Bob", "IT"),
                    new Employee("Carol", "HR")
            );

            Map<String, List<Employee>> groupedByDept = new HashMap<>();

            for (Employee emp : employees) {
                groupedByDept.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
            }

            System.out.println(groupedByDept);
        }
    }


