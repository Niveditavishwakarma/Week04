package reflectionproblems.advancedLevel;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Greeting {
    void sayHello();
}

class LoggingInvocationHandler implements InvocationHandler {
    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging: Calling method " + method.getName());

        return method.invoke(target, args);
    }
}

class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class DynamicProxyExample {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();

        Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingInvocationHandler(greeting)
        );

        proxyGreeting.sayHello();
    }

}
