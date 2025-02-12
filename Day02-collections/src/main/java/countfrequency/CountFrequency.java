package countfrequency;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class CountFrequency {
    public static Map<String,Integer> frequencyCounter(List<String> list)
    {
        Map<String,Integer> map = new HashMap<>();
        for(String str : list)
        {
            if(map.containsKey(str))
            {
                map.put(str,map.get(str)+1);
            }
            else
                map.put(str,1);
        }
        return map;
    }
}
