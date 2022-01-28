import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayUtil<T>{

    public static<T extends Comparable<? super T>> boolean isSorted(ArrayList<T> list1){
        ArrayList<T> temp1 = new ArrayList<>(list1);
        Collections.sort(temp1);
        return list1.equals(temp1);
    }

    public static<T extends Comparable<T>> int binSearch(T[] lista1, T t1){
        Collections.sort(lista1);
        return Arrays.binarySearch(lista1, t1);

    }


}
