package rotatelist;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int rotateBy = 2;
        List<Integer> rotatedList = new ArrayList<>();
        rotatedList = RotateList.rotateList(list,rotateBy);

        System.out.println("Original list: " + list);
        System.out.println("Rotated list: " + rotatedList);
    }
}
