package pl.imiajd.kawczynski;

public class Nauczyciel extends Osoba {

    private String pensja;

    public Nauczyciel(String nazwisko, String dataUrodzenia, String pensja) {
        super(nazwisko, dataUrodzenia);
        this.pensja = pensja;
    }

    public String getPensja() {
        return pensja;
    }

    public void setPensja(String pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Nauczyciel " + super.toString() + ", pensja = " + pensja;
    }


    //
//        return super.toString() + "blablabla";

}
