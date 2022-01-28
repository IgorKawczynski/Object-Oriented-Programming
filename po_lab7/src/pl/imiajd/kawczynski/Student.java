package pl.imiajd.kawczynski;

public class Student extends Osoba {

    public double średniaOcen;

    public Student(String nazwisko, String kierunek, double średniaOcen) {
        super(nazwisko);
        this.kierunek = kierunek;
        this.średniaOcen = średniaOcen;
    }

    public String getOpis() {
        return "kierunek studiów: " + kierunek;
    }

    private String kierunek;

    public double getŚredniaOcen() {
        return średniaOcen;
    }

    public void setŚredniaOcen(double średniaOcen) {
        this.średniaOcen = średniaOcen;
    }
}
