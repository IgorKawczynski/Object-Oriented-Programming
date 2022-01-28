package pl.imiajd.kawczynski;

import java.time.LocalDate;

public abstract class Osoba
{
    public String[] imiona;
    public LocalDate dataUrodzenia;
    public boolean płeć;

    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean płeć)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.płeć = płeć;
    }

    public Osoba(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    private String nazwisko;

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean isPłeć() {
        return płeć;
    }

}
