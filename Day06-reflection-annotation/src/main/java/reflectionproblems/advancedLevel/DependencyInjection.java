package reflectionproblems.advancedLevel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}

class SimpleDIContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();

    public <T> void register(Class<T> clazz, T instance) {
        instances.put(clazz, instance);
    }

    public <T> T getInstance(Class<T> clazz) {
        try {
            if (instances.containsKey(clazz)) {
                return (T) instances.get(clazz);
            }

            T instance = clazz.getDeclaredConstructor().newInstance();

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true); // Make private fields accessible

                    Class<?> fieldType = field.getType();

                    Object dependency = instances.get(fieldType);

                    if (dependency != null) {
                        field.set(instance, dependency);
                    } else {
                        throw new RuntimeException("No instance found for " + fieldType.getName());
                    }
                }
            }

            instances.put(clazz, instance);
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error creating instance of " + clazz.getName(), e);
        }
    }
}

class ServiceA {
    public void performAction() {
        System.out.println("ServiceA performing action...");
    }
}

class ServiceB {
    @Inject
    private ServiceA serviceA;

    public void performAction() {
        System.out.println("ServiceB performing action...");
        serviceA.performAction();
    }
}


public class DependencyInjection {
    public static void main(String[] args) {
        SimpleDIContainer container = new SimpleDIContainer();

        container.register(ServiceA.class, new ServiceA());

        ServiceB serviceB = container.getInstance(ServiceB.class);

        serviceB.performAction();
    }

}
