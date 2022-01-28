package kawczynski;

public class Student extends Osoba implements Comparable, Cloneable{

    private double sredniaOcen;

    public Student(String nazwisko, int year, int month, int day, double sredniaOcen) {
        super(nazwisko, year, month, day);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        int comparing = String.CASE_INSENSITIVE_ORDER.compare(this.getNazwisko(), student.getNazwisko());
        if(comparing==0){
            comparing = this.getDataUrodzenia().compareTo(student.getDataUrodzenia());
            if(comparing==0){
                comparing = (int)(this.sredniaOcen - student.sredniaOcen);
            }
        }
        return comparing;
    }
}
