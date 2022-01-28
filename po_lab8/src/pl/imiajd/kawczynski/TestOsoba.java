package pl.imiajd.kawczynski;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;


public class TestOsoba {

    public static void main(String[] args) {

        ArrayList<Osoba> grupa = new ArrayList<Osoba>(5);
        Osoba osoba1 = new Osoba("Sypelek", 2001, 7, 29);
        Osoba osoba2 = new Osoba("Sypelek", 2009, 2, 8);
        Osoba osoba3 = new Osoba("Piotrowski", 1994, 11, 21);
        Osoba osoba4 = new Osoba("Rybicka", 1994, 11, 21);
        Osoba osoba5 = new Osoba("Kawczynsky", 2001, 9, 24);

        grupa.add(osoba1);
        grupa.add(osoba2);
        grupa.add(osoba3);
        grupa.add(osoba4);
        grupa.add(osoba5);

        System.out.println("\nGRUPA PRZED SORTOWANIEM : ");
        for(Osoba o: grupa){
            System.out.println(o);
        }

        grupa.sort(Comparator.naturalOrder());

        System.out.println("\nGRUPA PO SORTOWANIU : ");
        for(Osoba o: grupa){
            System.out.println(o);
        }

        System.out.println("\nCZY OSOBA 1 = OSOBA 2 ? :");
        System.out.println(osoba1.compareTo(osoba2));

        System.out.println("\nCZY OSOBA 1 = OSOBA 1 ? :");
        System.out.println(osoba1.compareTo(osoba1));

        System.out.println("\nCZY OSOBA 1 NAZWISKO = OSOBA 2 NAZWISKO ? :");
        System.out.println(osoba1.getNazwisko().equals(osoba2.getNazwisko()));


    }

}