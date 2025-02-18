package annotationproblems.advancelevel.roleallowed;
import java.lang.reflect.Method;
public class AccessControl {

        private String currentUserRole;

        public AccessControl(String currentUserRole) {
            this.currentUserRole = currentUserRole;
        }

        public void checkAccess(Object obj, String methodName) {
            try {
                Class<?> clazz = obj.getClass();
                Method method = clazz.getMethod(methodName);
                if (method.isAnnotationPresent(RoleAllowed.class)) {
                    RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                    String allowedRole = roleAllowed.value();

                    if (allowedRole.equals(currentUserRole)) {
                        method.invoke(obj);
                    } else {
                        System.out.println("Access Denied! You do not have permission to execute this method.");
                    }
                } else {
                    method.invoke(obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


