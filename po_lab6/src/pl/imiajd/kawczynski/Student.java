package pl.imiajd.kawczynski;

public class Student extends Osoba{

    private String kierunek;

    public Student(String nazwisko, String rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return "Student " + super.toString() +  ", kierunek = " + kierunek;
    }
}
