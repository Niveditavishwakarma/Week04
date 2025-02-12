package removeduplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        List<Integer> unique = new ArrayList<>();
        unique = RemoveDuplicates.removeDuplicates(list);
        System.out.println("Original list: " + list);
        System.out.println("Unique list: " + unique);

    }
}
