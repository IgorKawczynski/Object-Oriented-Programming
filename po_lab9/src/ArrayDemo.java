import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemo {

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>(5);
        list1.add(5);
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(7);

        ArrayList<LocalDate> list2 = new ArrayList<>(5);
        list2.add(LocalDate.of(2001, 10, 24));
        list2.add(LocalDate.of(2000, 3, 21));
        list2.add(LocalDate.of(1994, 7, 7));
        list2.add(LocalDate.of(2006, 10, 1));
        list2.add(LocalDate.of(2042, 11, 18));

        System.out.println("\nIs list1 sorted ? :");
        System.out.println(ArrayUtil.isSorted(list1));
        System.out.println("Is list2 sorted ? :");
        System.out.println(ArrayUtil.isSorted(list2));

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("\nIs list1 sorted ? :");
        System.out.println(ArrayUtil.isSorted(list1));
        System.out.println("Is list2 sorted ? :");
        System.out.println(ArrayUtil.isSorted(list2));

        System.out.println("Index of searching object (7) in list1 : ");
        System.out.println(ArrayUtil.binSearch(list1, 7));
        System.out.println("Index of searching object (date of 2006;10;1) in list2 : ");
        System.out.println(ArrayUtil.binSearch(list2, LocalDate.of(2006, 10, 1)));

        ArrayList<Integer> list11 = new ArrayList<>(5);
        list11.add(5);
        list11.add(2);
        list11.add(4);
        list11.add(6);
        list11.add(7);

        System.out.println("\nList 11 before selection sort : ");

        for(Integer i: list11)
            System.out.println(i);

        ArrayUtil.selectionSort(list11);

        System.out.println("\nList 11 after selection sort : ");
        for(Integer i: list11)
            System.out.println(i);

        ArrayList<Integer> list22 = new ArrayList<>(7);
        list22.add(5);
        list22.add(21);
        list22.add(0);
        list22.add(1);
        list22.add(4);
        list22.add(2);
        list22.add(2);

        System.out.println("\nList 22 before merge sort : ");
        for(Integer i22: list22)
            System.out.println(i22);

        ArrayUtil.mergeSort(list22);

        System.out.println("\nList 22 after merge sort : ");
        for(Integer i22: list22)
            System.out.println(i22);

        ArrayList<Integer> list33 = new ArrayList<>(6);
        list33.add(2);
        list33.add(1);
        list33.add(4);
        list33.add(5);
        list33.add(3);
        list33.add(2);

        System.out.println("\nList 33 before merge sort : ");
        for(Integer i33: list33)
            System.out.println(i33);

        ArrayUtil.mergeSort(list33);

        System.out.println("\nList 33 after merge sort : ");
        for(Integer i33: list33)
            System.out.println(i33);

    }
}
