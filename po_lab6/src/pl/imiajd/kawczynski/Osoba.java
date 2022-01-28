package pl.imiajd.kawczynski;

public class Osoba {

    private String nazwisko;
    private String rokUrodzenia;

    public Osoba(String nazwisko, String rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setRokUrodzenia(String rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return  "Nazwisko = " + nazwisko +
                ", RokUrodzenia = " + rokUrodzenia;
    }
}
