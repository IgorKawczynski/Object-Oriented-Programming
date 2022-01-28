package pl.edu.uwm.obiektowe.s162423.kolo1;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

public class Osoba {

    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;


    public Osoba(String imie, String nazwisko, int year, int month, int day){
        this.imie = imie;
        this.nazwisko = nazwisko;
        dataUrodzenia = LocalDate.of(year, month, day);
    }

    private int oblicz_wiek(){
        LocalDate aktualnaData = LocalDate.now();
        this.wiek = Period.between(this.dataUrodzenia, aktualnaData).getYears();
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public int getWiek() {
        return oblicz_wiek();
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek() {
        LocalDate aktualnaData = LocalDate.now();
        this.wiek = Period.between(this.dataUrodzenia, aktualnaData).getYears();
    }

    public void setDataUrodzenia(int year, int month, int day) {
        boolean dni = LocalDate.of(year, month, day).isAfter(LocalDate.now());
        if(dni == false){
            dataUrodzenia = LocalDate.of(year, month, day);
        }
        else {
            System.out.println("WRONG DATE!");
        }

    }

    @Override
    public String toString() {
        return "Osoba " +
                imie + " " +
                nazwisko + " " +
                "urodzona " + dataUrodzenia +
                ", wiek " + wiek;
    }
}

class Pracownik extends Osoba {

    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, int year, int month, int day, String stanowisko, double pensja) {
        super(imie, nazwisko, year, month, day);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Osoba " +
                getImie() + " " +
                getNazwisko() + " " +
                "urodzona " + getDataUrodzenia() +
                ", wiek " + getWiek() +
                " jest pracownikiem na stanowisku " + stanowisko +
                " z pensją " + String.format("%.2f", pensja) + "zł ";
    }
}

class TestKOLOS {


        public static void main(String[] args) {


            Osoba osoba1 = new Osoba("Igor", "Kapczowski", 2001, 11, 15);
            osoba1.setWiek();
            System.out.println("Wiek osoby1: " + osoba1.getWiek());
            System.out.println("DataUrodzenia osoby1 po zmianie roku na 2012: " + osoba1.getDataUrodzenia());
            osoba1.setDataUrodzenia(2024, 11, 15);
            osoba1.setWiek();
            System.out.println("Wiek osoby1 po zmianie roku na 2024: " + osoba1.getWiek());
            osoba1.setImie("Ajgorek");
            System.out.println(osoba1);
            Osoba osoba2 = new Osoba("Wojtek", "Kowal", 2003, 11, 15);
            osoba2.setWiek();
            Osoba osoba3 = new Osoba("Kajtek", "Omamale", 2021, 10, 15);
            osoba3.setWiek();
            Osoba osoba4 = new Osoba("Dagmara", "Szewczyk", 2011, 7, 17);
            osoba4.setWiek();


            Pracownik pracownik1 = new Pracownik("Pawcik", "Wiertunik", 1993, 10, 3, "konferansjer", 4000);
            pracownik1.setPensja(12300);
            pracownik1.setWiek();
            pracownik1.setDataUrodzenia(1994, 11, 4);
            System.out.println(pracownik1);
            Pracownik pracownik2 = new Pracownik("Alejandro", "Majewski", 1996, 4, 24, "rzecznik", 6000);
            Pracownik pracownik3 = new Pracownik("Don", "Pedro", 1997, 10, 26, "rybak", 47000);
            Pracownik pracownik4 = new Pracownik("Belissimo", "Martyniuk", 2004, 11, 25, "serducho", 2300);
            pracownik2.setWiek();
            pracownik3.setWiek();


            ArrayList<Osoba> Lista_Osob = new ArrayList<>(4);
            Lista_Osob.add(osoba1);
            Lista_Osob.add(osoba2);
            Lista_Osob.add(osoba3);
            Lista_Osob.add(osoba4);
            System.out.println("\nLISTA OSOB : ");
            for (Osoba i : Lista_Osob)
                System.out.println(i.toString());


            ArrayList<Pracownik> Lista_Pracownikow = new ArrayList<>(4);
            Lista_Pracownikow.add(pracownik1);
            Lista_Pracownikow.add(pracownik2);
            Lista_Pracownikow.add(pracownik3);
            Lista_Pracownikow.add(pracownik4);
            System.out.println("\nLISTA PRACOWNIKOW : ");
            for (Pracownik i : Lista_Pracownikow)
                System.out.println(i.toString());
            double suma = 0;
            for (Pracownik i : Lista_Pracownikow)
                suma = suma + i.getPensja();
            System.out.println("\nSUMA PENSJI PRACOWNIKOW : ");
            System.out.println(suma);

        }


    }
