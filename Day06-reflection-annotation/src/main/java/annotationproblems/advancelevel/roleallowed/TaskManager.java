package annotationproblems.advancelevel.roleallowed;

public class TaskManager {

        @RoleAllowed("ADMIN")
        public void createAdminTask() {
            System.out.println("Admin task created.");
        }

        @RoleAllowed("USER")
        public void createUserTask() {
            System.out.println("User task created.");
        }

        public void createGeneralTask() {
            System.out.println("General task created.");
        }
    }


