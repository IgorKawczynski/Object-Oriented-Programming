package kawczynski;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStudent {


    public static void main(String[] args) {

        ArrayList<Student> grupa = new ArrayList<Student>(5);
        Student student1 = new Student("Sypelek", 2001, 7, 29, 4.8);
        Student student2 = new Student("Sypelek", 2009, 2, 8, 3.4);
        Student student3 = new Student("Piotrowski", 1994, 11, 21, 3.0);
        Student student4 = new Student("Rybicka", 1994, 11, 21, 4.1);
        Student student5 = new Student("Kawczynsky", 2001, 9, 24, 5.0);

        grupa.add(student1);
        grupa.add(student2);
        grupa.add(student3);
        grupa.add(student4);
        grupa.add(student5);

        System.out.println("\nGRUPA PRZED SORTOWANIEM : ");
        for(Student s: grupa){
            System.out.println(s);
        }

        grupa.sort(Comparator.naturalOrder());

        System.out.println("\nGRUPA PO SORTOWANIU : ");
        for(Student s: grupa){
            System.out.println(s);
        }

        System.out.println("\nCZY STUDENT 1 = STUDENT 2 ? :");
        System.out.println(student1.compareTo(student2));

        System.out.println("\nCZY STUDENT 1 = STUDENT 1 ? :");
        System.out.println(student1.compareTo(student1));

        System.out.println("\nCZY STUDENT 1 NAZWISKO = STUDENT 2 NAZWISKO ? :");
        System.out.println(student1.getNazwisko().equals(student2.getNazwisko()));

    }
}
