import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static List<Object> filterList (final List<Object> list){
        List<Object> listOfInt = new ArrayList<>();
        for (Object o :list) {
            if(o instanceof Integer)
                listOfInt.add( o);
        }
        return listOfInt;
    }
    public static List<Object> filterList2 (final List<Object> list){
        return list.stream().filter(i -> i instanceof Integer).collect(Collectors.toList());
    }
}
