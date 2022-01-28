//TODO --------wasting time function wtf---------
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.util.List;

public class Pracownik {

    private String nazwisko;

    private int day;
    private double pobory;
    private LocalDate dataZatrudnienia;


    // KONSTRUKTOR -- BO NAZWA TAKA SAMA JAK NAZWA KLASY
    public Pracownik(String nazwisko, double pobory, int year, int month, int day) {
        this.nazwisko = nazwisko; // THIS - CZYLI NA ,, TYM '' OBIEKCIE OPERUJEMY, TE NAZWISKO ( TZN PODANE DLA DANEGO OBIEKTU, NP. PRACOWNIKA NR.1 ) = NAZWISKO PODANE W ARGUMENCIE
        this.pobory = pobory;
        this.day = day;
        dataZatrudnienia = LocalDate.of(year, month, day);
    }

    public int getDay() {
        return day;
    }

    public String nazwisko() {
        
        return nazwisko;
    }

    public double pobory() {

        return pobory;
    }

    public LocalDate dataZatrudnienia() {

        return dataZatrudnienia;
    }

    public void zwiekszPobory(double procent) {
        double podwyzka = pobory * procent / 100;
        pobory += podwyzka;
    }


}


class TestPracownikDemo1 {

    public static void main(String[] args) {
        Pracownik[] personel = new Pracownik[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new Pracownik("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new Pracownik("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new Pracownik("Antoni Tester", 40000, 2005, 3, 15);

        // zwiększ pobory każdego pracownika o 20%
        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }

        // wypisz informacje o każdym pracowniku
        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

        // Poniższy fragment pokazuje problem naruszenia hermetyzacji
        // wynikający z niepoprawnie zaprogramowanej metody dataZatrudnienia()
        LocalDate d = personel[0].dataZatrudnienia();

        double tenYersInMiliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
//        d.atTime(d.of(d.getYear(), d.getMonth(), 3) - minus((long) tenYersInMiliSeconds));

        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();


    }
}
