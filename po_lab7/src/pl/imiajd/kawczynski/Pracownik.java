package pl.imiajd.kawczynski;

import java.time.LocalDate;

public class Pracownik extends Osoba
{

    public LocalDate dataZatrudnienia;

    public Pracownik(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean płeć, LocalDate dataZatrudnienia, double pobory)
    {
        super(nazwisko, imiona, dataUrodzenia, płeć);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }
}
