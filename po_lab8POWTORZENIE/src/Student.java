import java.time.LocalDate;

public class Student extends Osoba implements Comparable<Osoba>, Cloneable{

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sredniaOcen=" + sredniaOcen +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.sredniaOcen, sredniaOcen) == 0;
    }

    @Override
    public int compareTo(Osoba o) {
        return super.compareTo(o);

    }

    @Override
    public Student clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
