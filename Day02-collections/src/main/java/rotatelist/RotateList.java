package rotatelist;
import java.util.ArrayList;
import java.util.List;
class RotateList {
    public static <T> List<T> rotateList(List<T> list,int position)
    {
        int size = list.size();
        if(size == 0 || position  == 0)
        {
            return list;
        }

        position = position % size;
        List<T> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(position,size));
        rotatedList.addAll(list.subList(0,position));

        return rotatedList;
    }
}
