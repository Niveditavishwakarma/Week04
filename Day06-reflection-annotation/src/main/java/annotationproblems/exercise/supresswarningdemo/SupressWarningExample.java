package annotationproblems.exercise.supresswarningdemo;
import java.util.ArrayList;
public class SupressWarningExample {

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(34);
        list.add(45.435);

        String str = (String)list.get(0);
        int num = (int) list.get(1);
        double d = (double) list.get(2);

        System.out.println("String: " + str);
        System.out.println("Integer value: " + num);
        System.out.println("double value: " + d);
    }

}
