package reverselist;
import java.util.*;
class ReverseList {
    public static <T> void reverse(List<T> list)
    {
        int low = 0;
        int high = list.size() -1;
        while(low<high)
        {
            T temp = list.get(low);
            list.set(low,list.get(high));
            list.set(high,temp);
            low++;
            high--;
        }
    }
}
