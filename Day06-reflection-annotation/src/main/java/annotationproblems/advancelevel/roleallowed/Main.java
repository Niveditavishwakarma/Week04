package annotationproblems.advancelevel.roleallowed;

public class Main {
        public static void main(String[] args) {
            AccessControl adminAccessControl = new AccessControl("ADMIN");
            TaskManager taskManager = new TaskManager();

            System.out.println("Testing with ADMIN role:");
            adminAccessControl.checkAccess(taskManager, "createAdminTask");
            adminAccessControl.checkAccess(taskManager, "createUserTask");
            adminAccessControl.checkAccess(taskManager, "createGeneralTask");

            AccessControl userAccessControl = new AccessControl("USER");
            System.out.println("\nTesting with USER role:");
            userAccessControl.checkAccess(taskManager, "createAdminTask");
            userAccessControl.checkAccess(taskManager, "createUserTask");
            userAccessControl.checkAccess(taskManager, "createGeneralTask");
        }
    }


