import java.lang.reflect.Array;
import java.util.*;

public class IntegerSet extends ArrayList<Integer>{

    //field list necessary to constructor
    private final ArrayList<Integer> list;

    //constructor
    public IntegerSet(ArrayList<Integer> list) {
        this.list = list;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<>(list1.size() + list2.size());
        list3.addAll(list1);
        list3.addAll(list2);
        return list3;
    }

    public static ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3 = new ArrayList<>(list1.size() + list2.size());
        for(Integer e : list1){
            if(list2.contains(e))
                list3.add(e);
        }
        return list3;
    }

    public void insertElement(Integer x){

        list.add(x);
    }

    public void deleteElement(Integer x){
        for(int e=0; e<list.size(); e++){
            if(list.get(e).equals(x))
                list.remove(x);
        }
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Integer integer : list) {
            temp.append(integer).append(" ");
        }
        return temp.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IntegerSet integers = (IntegerSet) o;
        return Objects.equals(list, integers.list);
    }

}


class TestIntegerSet {
    public static void main(String[] args) {

        //union test
        ArrayList<Integer> list1 = new ArrayList<>(5);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("LIST1 : ");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(5);

        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(33);

        System.out.println("\nLIST2 : ");
        System.out.println(list2);

        ArrayList<Integer> list3;
        list3 = IntegerSet.union(list1, list2);

        System.out.println("\nUNION OF LIST1 N' LIST2 : ");
        System.out.println(list3);

        //INTERSECTION TEST
        ArrayList<Integer> list4 = new ArrayList<>(5);

        list4.add(91);
        list4.add(93);
        list4.add(95);
        list4.add(97);
        list4.add(99);

        System.out.println("\nLIST4 : ");
        System.out.println(list4);

        ArrayList<Integer> list5 = new ArrayList<>(5);

        list5.add(99);
        list5.add(98);
        list5.add(96);
        list5.add(94);
        list5.add(93);

        System.out.println("\nLIST5 : ");
        System.out.println(list5);

        ArrayList<Integer> list6;
        list6 = IntegerSet.intersection(list4, list5);

        System.out.println("\nINTERSECTION OF LIST4 N' LIST5 : ");
        System.out.println(list6);

        //INSERT TEST
        IntegerSet list7 = new IntegerSet(new ArrayList<>());
        System.out.println("\nLIST7 : ");
        list7.add(24);
        list7.add(48);
        list7.insertElement(44);
        list7.insertElement(77);
        list7.insertElement(44);
        System.out.println("\nLIST7 AFTER INSERT : ");
        System.out.println(list7);

        //DELETE TEST
        System.out.println("\nLIST7 AFTER DELETE : ");
        list7.deleteElement(44);
        System.out.println(list7);

        //EQUALS TEST
        IntegerSet list8 = new IntegerSet(new ArrayList<>());
        System.out.println("\nLIST8 : ");
        list8.insertElement(24);
        list8.insertElement(48);
        list8.insertElement(77);
        System.out.println("\nIS LIST7 EQUAL TO LIST8? : ");
        System.out.println(list7.equals(list8));

    }
}











































//
//
//
//
//
//import java.lang.reflect.Array;
//        import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.Collections;
//        import java.util.Random;
//
//public class IntegerSet {
//
//    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
//        ArrayList<Integer> list3 = new ArrayList<>(list1.size() + list2.size());
//        list3.addAll(list1);
//        list3.addAll(list2);
//        return list3;
//    }
//
//    public static ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2){
//        ArrayList<Integer> list3 = new ArrayList<>(list1.size() + list2.size());
//        for(Integer e : list1){
//            if(list2.contains(e))
//                list3.add(e);
//        }
//        return list3;
//    }
//
//    public static void insertElement(Integer x, ArrayList<Integer> list){
//        list.add(x);
//    }
//    public static void deleteElement(Integer x, ArrayList<Integer> list){
//        for(int e=0; e<list.size(); e++){
//            if(list.get(e).equals(x))
//                list.remove(x);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//}
//class TestIntegerSet {
//    public static void main(String[] args) {
//
//        //union test
//        ArrayList<Integer> list1 = new ArrayList<>(5);
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//        System.out.println("LIST1 : ");
//        for (Integer e : list1) {
//            System.out.println(e);
//        }
//        ArrayList<Integer> list2 = new ArrayList<>(5);
//        list2.add(6);
//        list2.add(7);
//        list2.add(8);
//        list2.add(9);
//        list2.add(33);
//        System.out.println("\nLIST2 : ");
//        for (Integer e : list2) {
//            System.out.println(e);
//        }
//        ArrayList<Integer> list3;
//        list3 = IntegerSet.union(list1, list2);
//        System.out.println("\nUNION OF LIST1 N' LIST2 : ");
//        for (Integer e : list3) {  // ATTENTION ! IT HAS TO BE ,,INTEGER'' IN ARRAYLISTS! SIMPLY INT E : LIST3 WONT WORK PROPERLY
//            System.out.println(e);
//        }
//
//        //intersection test
//        ArrayList<Integer> list4 = new ArrayList<>(5);
//        list4.add(91);
//        list4.add(93);
//        list4.add(95);
//        list4.add(97);
//        list4.add(99);
//        System.out.println("\nLIST4 : ");
//        for (Integer e : list4) {
//            System.out.println(e);
//        }
//        ArrayList<Integer> list5 = new ArrayList<>(5);
//        list5.add(99);
//        list5.add(98);
//        list5.add(96);
//        list5.add(94);
//        list5.add(93);
//        System.out.println("\nLIST5 : ");
//        for (Integer e : list5) {
//            System.out.println(e);
//        }
//        ArrayList<Integer> list6;
//        list6 = IntegerSet.intersection(list4, list5);
//        System.out.println("\nINTERSECTION OF LIST4 N' LIST5 : ");
//        for(Integer x : list6){
//            System.out.println(x);
//        }
//        ArrayList<Integer> list7 = new ArrayList<>();
//        IntegerSet.insertElement(24, list7);
//        IntegerSet.insertElement(44, list7);
//        IntegerSet.insertElement(66, list7);
//        IntegerSet.insertElement(44, list7);
//        System.out.println("\nLIST7 AFTER INSERT : ");
//        for(Integer x : list7){
//            System.out.println(x);
//        }
//        System.out.println("\nLIST7 AFTER DELETE : ");
//        IntegerSet.deleteElement(44, list7);
//        for(Integer x : list7){
//            System.out.println(x);
//        }
//
//        System.out.println(list7.toString());
//
//
//
//    }
//}