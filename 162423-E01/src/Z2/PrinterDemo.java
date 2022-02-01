package Z2;

import java.time.LocalTime;
import java.util.*;

public class PrinterDemo {

    public static void main(String[] args){

        LinkedList<Integer> linkedlist1 = new LinkedList<>(List.of(1, 3, 5, 8, 11, 14, 16, 19));
        System.out.println("\nlinkedlist1 : " + linkedlist1);
        System.out.println("First and Last element of linkedlist1 :");
        Printer.printMarginal(linkedlist1);
        System.out.println("\n");

        TreeSet<Character> treeset1 = new TreeSet<>(List.of('A', 'B', 'C', 'D', 'E', 'F', 'G'));
        System.out.println("treeset1 : " + treeset1);
        System.out.println("First and Last element of treeset1 :");
        Printer.printMarginal(treeset1);
        System.out.println("\n");

        ArrayList<String> arraylist1 = new ArrayList<>(List.of("pierwszy", "drugi", "ostatni"));
        System.out.println("arraylist1 : " + arraylist1);
        System.out.println("First and Last element of arraylist1 :");
        Printer.printMarginal(arraylist1);
        System.out.println("\n");

        HashSet<LocalTime> hashset1 = new HashSet<>(List.of(LocalTime.of(4, 15, 2), LocalTime.of(5, 12, 3)));
        System.out.println("hashset1 : " + hashset1);
        System.out.println("First and Last element of hashset1 :");
        Printer.printMarginal(hashset1);
        System.out.println("\n");

    }
}
