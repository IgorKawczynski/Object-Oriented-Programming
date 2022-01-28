import pl.imiajd.kawczynski.Osoba;
import pl.imiajd.kawczynski.Pracownik;
import pl.imiajd.kawczynski.Student;
import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Jan Kowalski", new String[]{"Wojtek", "Adaś", "Andiamo"},
                LocalDate.of(1993, 10, 24),
                false, LocalDate.of(2009, 11, 23), 3780);
        ludzie[1] = new Student("Małgorzata Nowak", "informatyka", 4.5);

        // OSOBA JAKO KLASA ABSTRAKCYJNA - NIE MOZNA WIEC TWORZYC INSTANCJI
        // klasa abstrakcyjna pozwala się do niej odnosić i pobierać odpowiednie atrybuty, nie można jednak jej instancjonować**
        // ludzie[2] = new Osoba("Dyl Sowizdrzał", new String[]{"Anabel", "Bermudy", "Witolo"},
        // LocalDate.of(1945, 8, 14), false);

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }

        // ??? jak wywołać funkcję z klasy STUDENT na obiekcie ,,ludzie[1]" ???
        //        Student studenciak = ludzie[1];

        Student studenciak = new Student("Barczewski", "informatyka", 4.3);
        System.out.println(ludzie[1].getDataUrodzenia());
        studenciak.setŚredniaOcen(5.0);
        System.out.println(studenciak.getŚredniaOcen());
        Pracownik pracowniak = new Pracownik("Barzewski", new String[]{"Basia", "Hanka"},
                LocalDate.of(1990, 10, 21), true,
                LocalDate.of(1898, 8, 8), 5000);
        System.out.println(pracowniak.getDataZatrudnienia());
        System.out.println(pracowniak.getPobory());

    }
}
