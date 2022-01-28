import java.util.ArrayList;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(5);
        list1.add(1);
        list1.add(0);
        list1.add(6);
        list1.add(9);
        list1.add(12);

        for(Integer i: list1){
            System.out.println(i);
        }

        System.out.println(ArrayUtil.isSorted(list1));

        System.out.println(ArrayUtil.binSearch(list1, 9));



    }
}
