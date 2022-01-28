import java.time.LocalDate;

public class Osoba implements Comparable<Osoba>, Cloneable{

    private String nazwisko;
    private LocalDate dataUrodzenia;


    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return nazwisko.equals(osoba.nazwisko) && dataUrodzenia.equals(osoba.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba o) {
        int wynik = this.nazwisko.compareTo(o.getNazwisko());
        if(wynik==0)
            return this.dataUrodzenia.compareTo(o.getDataUrodzenia());
        return wynik;
    }
}
