package kawczynski;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Comparable, Cloneable {

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, int year, int month, int day) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.of(year, month, day);
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" +
                nazwisko +
                "," + dataUrodzenia +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) && Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwisko, dataUrodzenia);
    }

    @Override
    public int compareTo(Object o) {
        Osoba osoba = (Osoba) o;
        int comparing = String.CASE_INSENSITIVE_ORDER.compare(this.getNazwisko(), osoba.getNazwisko());
        if(comparing==0){
            comparing = this.getDataUrodzenia().compareTo(osoba.getDataUrodzenia());
        }
        return comparing;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
