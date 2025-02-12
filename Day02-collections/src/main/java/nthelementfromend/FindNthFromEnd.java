package nthelementfromend;
import java.util.*;
class FindNthFromEnd {
    public static String findNthFromEnd(List<String> list, int N) {
        if (list == null || N <= 0) {
            return null;
        }

        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        for (int i = 0; i < N; i++) {
            if (!first.hasNext()) {
                return null;
            }
            first.next();
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static List<String> createList(String[] elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

}
