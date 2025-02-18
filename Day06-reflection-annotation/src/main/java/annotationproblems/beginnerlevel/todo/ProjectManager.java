package annotationproblems.beginnerlevel.todo;

public class ProjectManager {

        @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
        public void implementLogin() {
            System.out.println("Implementing login feature...");
        }

        @Todo(task = "Create user profile page", assignedTo = "Bob", priority = "MEDIUM")
        public void createUserProfile() {
            System.out.println("Creating user profile page...");
        }

        @Todo(task = "Implement payment gateway", assignedTo = "Charlie", priority = "HIGH")
        public void implementPaymentGateway() {
            System.out.println("Implementing payment gateway...");
        }

        public void deployToProduction() {
            System.out.println("Deploying to production...");
        }
    }


