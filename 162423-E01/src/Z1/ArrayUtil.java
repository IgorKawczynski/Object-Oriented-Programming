package Z1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtil {

    public static <T extends Comparable<T>> ArrayList<T> removeRepeatedElements(T[] tab){

        ArrayList<T> temp_tab = new ArrayList<>(List.of(tab));
        if(tab.length <= 1)
            return temp_tab;
        return temp_tab.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
    }


    //można także tablicę wrzucić do Setu, a następnie z tego setu dodać wszystkie elementy do ArrayList.
    //(set nie przechowuje duplikatów)
}
