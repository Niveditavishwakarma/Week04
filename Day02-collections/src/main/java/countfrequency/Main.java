package countfrequency;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Map<String,Integer> map = new HashMap<>();
        List<String> arraylist = new ArrayList<>(Arrays.asList("lambo","jaguar","ferrari","bugati","fortuner","thar","thar","fortuner","lambo","jaguar","fortuner","jaguar"));
        map = CountFrequency.frequencyCounter(arraylist);
        System.out.println("Frequency of elements: " + map);
    }
}
