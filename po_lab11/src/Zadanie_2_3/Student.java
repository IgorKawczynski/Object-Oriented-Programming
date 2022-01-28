package Zadanie_2_3;

public class Student implements Comparable<Student>{

    private String imie;
    private String nazwisko;
    private int id;

    public Student(String imie, String nazwisko, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nazwisko + " " + imie;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.nazwisko.compareTo(o.getNazwisko());
        if(result==0){
            int result_2 = this.imie.compareTo(o.getImie());
            if(result_2==0){
                int result_3 = Integer.compare(this.id, o.getId());
                return result_3;
            }
            return result_2;
        }
        return result;
    }
}
