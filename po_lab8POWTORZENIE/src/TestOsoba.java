import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {

    public static void main(String[] args) {

        ArrayList<Osoba> grupa1 = new ArrayList<>(5);
        grupa1.add(new Osoba("Wiertalak", LocalDate.of(2005, 12, 14)));
        grupa1.add(new Osoba("Komorowski", LocalDate.of(206, 12, 14)));
        grupa1.add(new Osoba("Mumia", LocalDate.of(2013, 12, 14)));
        grupa1.add(new Osoba("Mumia", LocalDate.of(2005, 12, 14)));
        grupa1.add(new Osoba("Czegotychciec", LocalDate.of(2005, 12, 14)));
        grupa1.add(new Osoba("Czegotychciec", LocalDate.of(2005, 12, 14)));

        int wynik = grupa1.get(0).compareTo(grupa1.get(1));
        System.out.println(wynik);
        wynik = grupa1.get(0).compareTo(grupa1.get(4));
        System.out.println(wynik);
        wynik = grupa1.get(2).compareTo(grupa1.get(3));
        System.out.println(wynik);
        wynik = grupa1.get(4).compareTo(grupa1.get(5));
        System.out.println(wynik);



    }

}
