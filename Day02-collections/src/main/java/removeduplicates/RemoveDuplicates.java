package removeduplicates;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;

class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list)
    {
        Set<T> seen = new LinkedHashSet<>();
        for(T nums : list)
        {
            seen.add(nums);
        }
        return new ArrayList<>(seen);
    }
}
